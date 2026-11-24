package complex_tasks.task_4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> movieRatings = new LinkedHashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        if (movie == null || rating == null) {
            throw new InvalidMovieException("Movie or rating can not be null");
        }
        if (rating.getRating() == null || rating.getRating().doubleValue() < 1 || rating.getRating().doubleValue() > 10) {
            throw new InvalidMovieException("Rating must be between 1 and 10");
        }
        movieRatings.putIfAbsent(movie, new ArrayList<>());
        movieRatings.get(movie).add(rating);
    }

    public synchronized double averageRating(Movie movie) {
        if (movie == null) {
            throw new InvalidMovieException("Movie can not be null");
        }
        if (!movieRatings.containsKey(movie)) {
            throw new InvalidMovieException("Movie was not found");
        }
        return movieRatings.get(movie)
                .stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElseThrow();
    }
}
