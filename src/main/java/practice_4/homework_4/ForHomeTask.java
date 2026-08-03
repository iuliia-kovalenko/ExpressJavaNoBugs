package practice_4.homework_4;

import java.util.Scanner;

public class ForHomeTask {
    public static void main(String[] args) {
        numbersDividedByThree();
        System.out.println(totalSum());
        multiplyTable();
        isPrimeNumber();
        numbers();
    }

    public static void numbersDividedByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int totalSum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void multiplyTable() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void isPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number < 2) {
            System.out.println("This is not prime number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "This is Prime number" : "This not Prime number");
    }

    public static void numbers() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
}
