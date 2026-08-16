package practice_4.homework_4;

import java.util.Scanner;

public class BreakContinueHomeTask {
    public static void main(String[] args) {
        System.out.println(sumPositiveNumbers());
        numbersNotDividedByThree();
        printPositiveNumbers();
        printText();
    }

    public static int sumPositiveNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        while (true) {
            number = sc.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        return sum;
    }

    public static void numbersNotDividedByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printPositiveNumbers() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            System.out.println(number + " is Positive");
        }
    }

    public static void printText() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            if (str.equals("stop")) {
                break;
            }
            System.out.println(str);
        }
    }
}
