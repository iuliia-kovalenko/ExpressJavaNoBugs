package practice_2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Volvo", 2026);
        car.print();

        car.setYear(2025);
        car.print();

        Rectangle rectangle = new Rectangle(20, 10);
        rectangle.setWidth(20);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("Book1", "Author1");
        book.print();
        book.setAuthor("Author2");
        book.print();

        BankAccount bankAccount = new BankAccount("Yulia Ivanova", 5000);
        bankAccount.printBalance();
        bankAccount.deposit(5000);
        bankAccount.withdraw(1000);
        bankAccount.printBalance();

        Point point = new Point(4.5, 6.6);
        point.print();
        point.setX(10);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Group1", 100);
        studentGroup.printInfo();
        studentGroup.setStudentCount(70);
        studentGroup.printInfo();

        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        circle.setRadius(10);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher teacher = new Teacher("Sergeev Ivan Petrovich", "Math");
        teacher.printInfo();

        teacher.setSubject("English");
        teacher.printInfo();

        Product product = new Product("MacBook", 2000);
        product.printInfo();

        product.setPrice(5000);
        product.applyDiscount(10);
        product.printInfo();


        Laptop laptop = new Laptop("MacBookPro", 2000);
        laptop.printInfo();

        laptop.setPrice(5000);
        laptop.printInfo();

    }
}
