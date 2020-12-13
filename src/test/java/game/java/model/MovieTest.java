package game.java.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class MovieTest {

    @Test
    void randomMovie_returnsNullString_givenEmptyList() {
        //given
        Movie emptyList = new Movie("emptyList");
        //when
        String emptyString = emptyList.randomMovie();
        //then
        assertSame(null, emptyString);
    }
    
    @Test
    void randomMovie_returnsString_givenFilesWithMovies(){
        //given
        Movie movies = new Movie("src/main/resources/movies.txt");
        //when
        String movieTitle = movies.randomMovie();
        //then
        assertNotNull(movieTitle);
    }

}