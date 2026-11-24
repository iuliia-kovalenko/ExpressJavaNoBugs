package complex_tasks.task_4;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic", "1997");
        Movie movie2 = new Movie("Twilight", "2008");

        MovieService<Number> service = new MovieService<>();

        service.addRating(movie1, new Rating<>(10.0));
        service.addRating(movie1, new Rating<>(1));
        service.addRating(movie1, new Rating<>(5));

        System.out.println(service.averageRating(movie1));

        service.addRating(movie2, new Rating<>(3));
        service.addRating(movie2, new Rating<>(3.0));
        service.addRating(movie2, new Rating<>(3.5));

        System.out.println(service.averageRating(movie2));
    }
}
