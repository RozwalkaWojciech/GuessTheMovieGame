package game.java.menu;

import game.java.game.Game;

public class Menu {

    public static void start() {
        System.out.print("Welcome to the game of Guess the Movie! " +
                "\nThe rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of." +
                "\nYour goal is to try to figure out the movie by guessing one letter at a time." +
                "\nIf a letter is indeed in the title the computer will reveal it's correct position in the word, if not, you lose a point." +
                "\nIf you lose 10 points, game over!!" +
                "\nAre you ready? Let's start!\n");

        Game game = new Game();
        game.start();
    }

}
