package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library("title", "author", 2026, "science");

        String author = library.author;
        System.out.println(library.year);
        System.out.println(library.category);

    }
}
