package game.java.game;

import game.java.menu.Menu;
import game.java.model.Movie;
import lombok.Getter;

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
        while (gameEnd()){
            Menu.guessMenu();
        }


    }

    private boolean gameEnd() {
        return chance == 0;
    }

}
