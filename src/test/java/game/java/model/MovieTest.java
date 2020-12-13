package game.java.model;

import org.junit.jupiter.api.Test;

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

}