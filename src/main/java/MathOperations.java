public class MathOperations {
    public static void main(String[] args) {
        System.out.println(add(3, 3));
        System.out.println(subtract(8, 3));
        System.out.println(multiply(8, 3));
        System.out.println(divide(8, 0));
        System.out.println(findMax(8, -9));
        System.out.println(difference(8, 9));
        System.out.println(squareArea(7));
        System.out.println(squarePerimeter(7));
        System.out.println(convertSecondsToMinutes(120));
        System.out.println(averageSpeed(120, 0));
        System.out.println(findHypotenuse(3, 3));
        System.out.println(circleCircumference(7));
        System.out.println(calculatePercentage(0, 4));
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(fahrenheitToCelsius(86));

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return x / (double) y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds/60.0;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9 ;
    }
}
