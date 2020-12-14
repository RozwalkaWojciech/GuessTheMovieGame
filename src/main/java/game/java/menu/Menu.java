package game.java.menu;

import game.java.game.Game;

public class Menu {

    public static void start(Game game) {
        System.out.println("\nWelcome to the game of Guess the Movie! " +
                "\nThe rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of." +
                "\nYour goal is to try to figure out the movie by guessing one letter at a time." +
                "\nIf a letter is indeed in the title the computer will reveal it's correct position in the word, if not, you lose a point." +
                "\nYou have 10 chance to do it, otherwise game over!!!" +
                "\nAre you ready? Let's start!" +
                "\nThe movie title has " + game.getMovieTitle().length() + " characters (including space and punctuation).\n");
    }

    public static void guessMenu(Game game) {
        System.out.print("You are guessing: " + game.getHiddenMovieTittle() +
                "\nYou have: " + game.getChance() + " chance" +
                "\nWrong letters:" + game.getWrongLetters());
    }

    public static void winMenu(Game game) {
        System.out.print("You WIN!" +
                "\nYou have guessed '" + game.getMovieTitle().toUpperCase() + "' correctly.");
    }

    public static void lostMenu(Game game) {
        System.out.print("-> GAME OVER <-" +
                "\nYou lost 10 chance. Wrong Letters:" + game.getWrongLetters() +
                "\nThe movie title was: ***" + game.getMovieTitle().toUpperCase() + "***" +
                "\nBetter luck next time.");

    }
}
