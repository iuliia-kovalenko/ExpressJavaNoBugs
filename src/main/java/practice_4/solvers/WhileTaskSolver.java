package practice_4.solvers;

import java.util.Arrays;
import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
//        printAllNumbersBefore10();
//        commandReader();
//        System.out.println(sumDigits(123));
//        System.out.println(sumDigits(1001));
        System.out.println(factorial());
    }

    public static void printAllNumbersBefore10() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= 10) {
            sb.append(i).append(" ");
            i++;
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    public static void commandReader() {
        Scanner sc = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Enter command: ");
            command = sc.nextLine();
        }
        System.out.println("Program exit");
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
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
}
