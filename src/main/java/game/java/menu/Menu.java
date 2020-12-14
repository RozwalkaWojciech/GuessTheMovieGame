package game.java.menu;

import game.java.game.Game;

public class Menu {

    private static final Game GAME = new Game();

    public static void start() {
        System.out.println("Welcome to the game of Guess the Movie! " +
                "\nThe rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of." +
                "\nYour goal is to try to figure out the movie by guessing one letter at a time." +
                "\nIf a letter is indeed in the title the computer will reveal it's correct position in the word, if not, you lose a point." +
                "\nYou have 10 chance to do it, otherwise game over!!!" +
                "\nAre you ready? Let's start!" +
                "\nThe movie title has " + GAME.getMovieTitle().length() + " characters (including space and punctuation).");
        GAME.start();
    }

    public static void guessMenu() {
        System.out.print("You are guessing: " + GAME.getHiddenMovieTittle() +
                "\nYou have: " + GAME.getChance() + " chance." +
                "\nWrong letters: " + GAME.getWrongLetters());
    }

    public static void winMenu() {
        System.out.print("You WIN!" +
                "\nYou have guessed '" + GAME.getMovieTitle() + "' correctly.");
    }

    public static void lostMenu() {
        System.out.print("You have guessed -> " + GAME.getWrongLetters().length() + " <- wrong letters: " + GAME.getWrongLetters() +
                "\nYou LOST!" +
                "\nThe movie title was " + GAME.getMovieTitle() +
                "\nBetter luck next time.");

    }
}
