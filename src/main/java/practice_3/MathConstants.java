package practice_3;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return PI * Math.pow(r, 2);
    }

    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    public static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return initialValue * Math.pow(E, rate * time);
    }
}
