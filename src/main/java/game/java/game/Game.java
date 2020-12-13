package game.java.game;

import game.java.model.Movie;

public class Game {

    private static final String MOVIES_PATH = "movies.txt";
    private final String movieTitle;
    private int pointsLost;
    private String rightLetters;
    private String wrongLetters;
    private boolean win;

    public Game() {
        Movie movie = new Movie(MOVIES_PATH);
        movieTitle = movie.randomMovie().trim();
        pointsLost = 0;
        rightLetters = "";
        wrongLetters = "";
        win = false;
    }

    public void start() {
//TODO
    }

    private boolean gameEnd() {
        return pointsLost == 10;
    }

    //TODO LOMBOK
    public String getMovieTitle() {
        return movieTitle;
    }

    public int getPointsLost() {
        return pointsLost;
    }

    public String getRightLetters() {
        return rightLetters;
    }

    public String getWrongLetters() {
        return wrongLetters;
    }

    public boolean isWin() {
        return win;
    }
}
