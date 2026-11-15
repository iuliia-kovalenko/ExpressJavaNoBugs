package complex_tasks.task_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    private MovieService<Number> movieService;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService<>();
    }

    @Test
    public void averageRatingOneRatingReturnsThatRatingTest() {
        Movie movie = new Movie("Titanic", "1997");
        double expectedAverageValue = 5.0;
        movieService.addRating(movie, new Rating<>(expectedAverageValue));

        assertEquals(expectedAverageValue, movieService.averageRating(movie), 1e-2);
    }

    @Test
    public void averageRatingSeveralRatingsReturnsMeanTest() {
        Movie movie = new Movie("Titanic", "1997");
        double rating1 = 5.0;
        int rating2 = 4;
        double expectedAverageValue = 4.5;

        movieService.addRating(movie, new Rating<>(rating1));
        movieService.addRating(movie, new Rating<>(rating2));

        assertEquals(expectedAverageValue, movieService.averageRating(movie), 1e-2);
    }

    @Test
    public void averageRatingDifferentMoviesDoNotMixTest() {
        Movie movie1 = new Movie("Movie1", "1999");
        Movie movie2 = new Movie("Movie2", "2000");
        double expectedAverageMovie1 = 10.0;
        double expectedAverageMovie2 = 6.0;

        movieService.addRating(movie1, new Rating<>(expectedAverageMovie1));
        movieService.addRating(movie2, new Rating<>(expectedAverageMovie2));

        assertEquals(expectedAverageMovie1, movieService.averageRating(movie1), 1e-2);
        assertEquals(expectedAverageMovie2, movieService.averageRating(movie2), 1e-2);
    }

    @Test
    public void averageRatingSameTitleAndYearCountsAsOneMovieTest() {
        Movie movie1 = new Movie("The Financier", "1912");
        Movie movie2 = new Movie("The Financier", "1912");
        int rating1 = 5;
        int rating2 = 8;
        double expectedAverage = 6.5;

        movieService.addRating(movie1, new Rating<>(rating1));
        movieService.addRating(movie2, new Rating<>(rating2));

        assertEquals(expectedAverage, movieService.averageRating(movie1), 1e-2);
    }


    public static Stream<Arguments> dataSetBoundaryValuesTest() {
        return Stream.of(
                Arguments.of(1, 1.0),
                Arguments.of(10, 10.0),
                Arguments.of(1.0, 1.0),
                Arguments.of(10.0, 10.0),
                Arguments.of(2, 2.0),
                Arguments.of(2.0, 2.0),
                Arguments.of(9, 9.0),
                Arguments.of(9.0, 9.0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSetBoundaryValuesTest")
    public void addRatingBoundaryValuesAreAcceptedTest(Number rating, double expectedAverage) {
        Movie movie = new Movie("1984", "1984");
        movieService.addRating(movie, new Rating<>(rating));

        assertEquals(expectedAverage, movieService.averageRating(movie), 1e-2);
    }

    public static Stream<Arguments> dataSetBoundaryValuesNegativeTest() {
        return Stream.of(
                Arguments.of(0.99),
                Arguments.of(10.01),
                Arguments.of(0),
                Arguments.of(-1),
                Arguments.of(11)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSetBoundaryValuesNegativeTest")
    public void addRatingOutOfRangeThrowsTest(Number rating) {
        Movie movie = new Movie("1984", "1984");

        assertThrows(InvalidMovieException.class, () -> {
            movieService.addRating(movie, new Rating<>(rating));
        }, "Rating not between 1 and 10 lead to InvalidMovieException");
    }

    public static Stream<Arguments> dataSetDifferentNumberTypesTest() {
        return Stream.of(
                Arguments.of(2, 9.9, 5.95),
                Arguments.of(8.8, 7, 7.9)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSetDifferentNumberTypesTest")
    public void addRatingDifferentNumberTypesAreAcceptedTest(Number rating1, Number rating2, Double averageRating) {
        Movie movie = new Movie("Three Comrades", "1936");
        movieService.addRating(movie, new Rating<>(rating1));
        movieService.addRating(movie, new Rating<>(rating2));

        assertEquals(averageRating, movieService.averageRating(movie), 1e-2);
    }

    @Test
    public void addRatingNullMovieThrowsTest() {
        assertThrows(InvalidMovieException.class, () -> {
            movieService.addRating(null, new Rating<>(5));
        }, "Null movie leads to InvalidMovieException");
    }

    @Test
    public void addRatingNullRatingThrowsTest() {
        assertThrows(InvalidMovieException.class, () -> {
            movieService.addRating(new Movie("Movie", "1900"), null);
        }, "Null rating leads to InvalidMovieException");
    }

    @Test
    public void averageRatingNullMovieThrowsTest() {
        assertThrows(InvalidMovieException.class, () -> {
            movieService.averageRating(null);
        }, "Average rating of null leads to InvalidMovieException");
    }

    @Test
    public void averageRatingUnknownMovieThrowsTest() {
        assertThrows(InvalidMovieException.class, () -> {
            movieService.averageRating(new Movie("Unknown", "2003"));
        }, "Average rating of movie that os not in movieService lead to InvalidMovieException");
    }
}
