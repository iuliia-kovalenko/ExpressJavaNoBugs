package practice_4.homework_4;

import java.util.Scanner;

public class DoWhileHomeTask {
    public static void main(String[] args) {
        enterPositiveNumber();
        checkPassword();
        tenNumbers();
        stopProgram();
        System.out.println(countDigits());
    }

    public static void enterPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number: ");
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Positive number: " + number);
    }

    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("password"));
        System.out.println("Access granted");
    }

    public static void tenNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void stopProgram() {
        Scanner sc = new Scanner(System.in);
        String inputText;

        do {
            System.out.print("Enter command: ");
            inputText = sc.nextLine();
        } while (!inputText.equals("exit"));
        System.out.println("Program is closed");
    }

    public static int countDigits() {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        if (number == 0 ) {
            return 1;
        }
        do {
            int tmp = number / 10;
            number = tmp;
            count ++;
        } while ( number != 0);
        return count;
    }
}
