package practice_8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(123);
        System.out.println(boxInteger.getElement());

        Box<Book> bookBox = new Box<>();
        bookBox.setElement(new Book("Book1", "Author1"));
        System.out.println(bookBox.getElement());
    }
}
