package practice_9.funcinterfaces;

public class Main {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations substract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;

        System.out.println(add.apply(2, 5));
        System.out.println(substract.apply(2, 5));
        System.out.println(multiply.apply(2, 5));
        System.out.println(divide.apply(2, 5));

        System.out.println("---------------------");
        Checker isPositive = n -> n > 0;
        isPositive.printIfValid(5);
        isPositive.printIfValid(-5);
    }
}
