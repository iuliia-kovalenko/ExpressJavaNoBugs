package practice_4.solvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
//        guessNumber();
//        findMinimum();
        checkCredentials();
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int random = new Random().nextInt(5);
        int inputNumber;
        do {
            System.out.print("Guess number: ");
            inputNumber = sc.nextInt();
        } while (inputNumber != random);

        System.out.println("Guessed!!!");
    }

    public static void findMinimum() {
        Scanner sc = new Scanner(System.in);

        int number;
        int minimum = Integer.MAX_VALUE;
        do {
            System.out.print("Enter number: ");
            number = sc.nextInt();
            if (number < minimum && number >= 0) {
                minimum = number;
            }
        } while (number >= 0);
        System.out.println("Minimum number: " + minimum);
    }

    public static void checkCredentials() {
        Scanner sc = new Scanner(System.in);
        String login;
        String password;
        do{
            System.out.print("Enter login: ");
            login = sc.nextLine();
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while(!login.equals("admin") || !password.equals("password"));
        System.out.println("Access granted");
    }
}
