package game.java.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Movie {

    private final List<String> movies;

    public Movie(String pathname) {

        movies = new ArrayList<>();
        File file = new File(pathname);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
    }

    public String randomMovie() {
        if (movies.isEmpty()) {
            return null;
        }
        return movies.get(new Random().nextInt(movies.size()));
    }
}
