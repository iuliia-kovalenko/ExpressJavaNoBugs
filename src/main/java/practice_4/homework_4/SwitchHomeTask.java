package practice_4.homework_4;

import java.util.Scanner;

public class SwitchHomeTask {
    public static void main(String[] args) {
        System.out.println(dayOfWeek());
        System.out.println(ticketPrice());
        System.out.println(scoreMapping());
        System.out.println(commandMapping());
        System.out.println(calculator());

    }

    public static String dayOfWeek() {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayDescription = "";

        switch (day) {
            case 1 -> dayDescription = "Monday";
            case 2 -> dayDescription = "Tuesday";
            case 3 -> dayDescription = "Wednesday";
            case 4 -> dayDescription = "Thursday";
            case 5 -> dayDescription = "Friday";
            case 6 -> dayDescription = "Saturday";
            case 7 -> dayDescription = "Sunday";
            default -> dayDescription = "Unknown day";
        }
        return dayDescription;
    }

    public static String ticketPrice() {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> {
                return "300 рублей";
            }
            case 6, 7 -> {
                return "450 рублей";
            }
            default -> {
                return "Unknown day";
            }
        }
    }

    public static String scoreMapping() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String description = "";
        if (score < 0 || score > 100) {
            System.out.println("Некорректно введена оценка");
        }
        switch (score / 10) {
            case 9, 10 -> description = "A";
            case 8 -> description = "B";
            case 7 -> description = "C";
            case 6 -> description = "D";
            case 5, 4, 3, 2, 1, 0 -> description = "F";
        }
        return description;
    }

//    Программа читает строку: "start", "stop", "restart" или "status".
//    Для каждой команды нужно вывести соответствующее сообщение, например: "Система запущена".

    public static String commandMapping() {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        String mapping = "";

        switch (command) {
            case "start" -> mapping = "Система запущена";
            case "stop" -> mapping = "Система остановлена";
            case "restart" -> mapping = "Система перезапущена";
            case "status" -> mapping = "Состояние системы";
            default -> mapping = "Неизвестная команда";
        }
        return mapping;
    }

//    Программа принимает два числа и оператор (+, -, *, /), затем выполняет операцию и выводит результат.

    public static int calculator() {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String sign = sc1.nextLine();

        switch (sign) {
            case "+" -> {
                return number1 + number2;
            }
            case "-" -> {
                return number1 - number2;
            }
            case "*" -> {
                return number1 * number2;
            }
            case "/" -> {
                if (number2 == 0) {
                    System.out.println("Division by 0 is forbidden");
                    return -1;
                }
                return number1 / number2;
            }
            default -> {
                System.out.println("Unknown operator");
                return -1;
            }
        }
    }

}
