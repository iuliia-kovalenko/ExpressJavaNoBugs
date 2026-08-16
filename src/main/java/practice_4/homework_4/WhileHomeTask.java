package practice_4.homework_4;

import java.util.Scanner;

public class WhileHomeTask {
    public static void main(String[] args) {
        System.out.println(factorial());
        evenNumbers();
        countBack();

    }

    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;
        int i = 1;

        while (i <= number) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static void evenNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while(i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void countBack() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
