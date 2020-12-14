package game.java.game;

import game.java.menu.Menu;
import game.java.model.Movie;
import lombok.Getter;

import java.util.Scanner;

@Getter
public class Game {

    private static final String MOVIES_PATH = "src/main/resources/movies.txt";
    private final String movieTitle;
    private int chance;
    private String rightLetters;
    private String wrongLetters;
    private boolean win;

    public Game() {
        Movie movie = new Movie(MOVIES_PATH);
        movieTitle = movie.randomMovie().trim();
        chance = 10;
        rightLetters = "";
        wrongLetters = "";
        win = false;
    }

    public void start() {
        while (!gameEnd()) {
            Menu.guessMenu();
            guessLetter();
        }
        if (win) {
            Menu.winMenu();
        } else {
            Menu.lostMenu();
        }
    }

    public String getHiddenMovieTittle() {
        if (rightLetters.equals("")) {
            return movieTitle.replaceAll("[a-zA-Z]", "_");
        } else {
            return movieTitle.replaceAll("[a-zA-Z&&[^" + rightLetters + "]]", "_");
        }
    }

    private boolean checkInputLetter(String letter) {

        if (!letter.matches("[a-z]")) {
            System.out.println("This is not a letter.");
            return false;
        } else if (wrongLetters.contains(letter) || rightLetters.contains(letter)) {
            System.out.println("You already guessed that letter.");
            return false;
        } else {
            return true;
        }
    }

    private void guessLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGuess the letter: ");
        String letter = scanner.nextLine().toLowerCase();
        if (checkInputLetter(letter)) {
            if (movieTitle.toLowerCase().contains(letter)) {
                rightLetters += letter + letter.toUpperCase();
            } else {
                chance--;
                wrongLetters += " " + letter;
            }
        } else {
            guessLetter();
        }
    }

    private boolean gameEnd() {
        if (!getHiddenMovieTittle().contains("_")) {
            win = true;
        }
        return chance == 0 || win;
    }

}
