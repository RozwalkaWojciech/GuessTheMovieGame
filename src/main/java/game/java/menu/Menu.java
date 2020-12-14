package game.java.menu;

import game.java.game.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Menu {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    private Menu() {
    }

    public static void start(Game game) {
        STDOUT.info("\nWelcome to the game of Guess the Movie!" +
                "\nThe rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of." +
                "\nYour goal is to try to figure out the movie by guessing one letter at a time." +
                "\nIf a letter is indeed in the title the computer will reveal it's correct position in the word, if not, you lose a point." +
                "\nYou have 10 chance to do it, otherwise game over!!!" +
                "\nAre you ready? Let's start!" +
                "\nThe movie title has {} characters (including space and punctuation).\n", game.getMovieTitle().length());
    }

    public static void guessMenu(Game game) {
        STDOUT.info("You are guessing: {}" +
                "\nYou have: {} chance" +
                "\nWrong letters:{}", game.getHiddenMovieTittle(), game.getChance(), game.getWrongLetters());
    }

    public static void winMenu(Game game) {
        STDOUT.info("You WIN!" +
                "\nYou have guessed '{}' correctly.", game.getMovieTitle().toUpperCase());
    }

    public static void lostMenu(Game game) {
        STDOUT.info("-> GAME OVER <-" +
                "\nYou lost 10 chance. Wrong Letters:{}" +
                "\nThe movie title was: ***{}***" +
                "\nBetter luck next time.", game.getWrongLetters(), game.getMovieTitle().toUpperCase());
    }
}
