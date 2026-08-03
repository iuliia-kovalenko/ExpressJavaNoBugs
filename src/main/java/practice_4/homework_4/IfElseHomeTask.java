package practice_4.homework_4;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class IfElseHomeTask {
    public static void main(String[] args) {
        System.out.println(signOfNumber(8));
        System.out.println(signOfNumber(0));
        System.out.println(signOfNumber(-9));
        System.out.println(maxOfTwoNumbers());
        System.out.println(markDescription());
        System.out.println(oddOrEven());
        System.out.println(discount());
        System.out.println(testResult());
    }

    public static String signOfNumber(int number) {
        String sign = "";
        if (number > 0) {
            sign = "Число положительное";
        } else if (number == 0) {
            sign = "Число равно нулю";
        } else {
            sign = "Число отрицательное";
        }
        return sign;
    }

    public static int maxOfTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        System.out.print("Введите число: ");
        int b = sc.nextInt();
        int max = a;
        if (a < b) {
            max = b;
        }
        return max;
    }

    public static String markDescription() {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        String description = "";
        switch (mark) {
            case 5:
                description = "Отлично";
                break;
            case 4:
                description = "Хорошо";
                break;
            case 3:
                description = "Удовлетворительно";
                break;
            case 2, 1:
                description = "Неудовлетворительно";
                break;
            default:
                description = "Неизвестная оценка";
        }
        return description;
    }

    public static String oddOrEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        String result = "";
        if (a % 2 == 0) {
            result = "Четное";
        } else {
            result = "Нечетное";
        }
        return result;
    }

    public static String discount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt();
        String discount = "";
        if (age <= 18) {
            discount = "25 %";
        } else if (age >= 65 ) {
            discount = "30 %";
        } else {
            discount = "Без скидки";
        }
        return discount;
    }

    public static String testResult() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        String result = "";
        if (number < 0 || number > 100) {
            result = "Некорректно введенные баллы";
        } else if (number >= 90) {
            result = "Отлично";
        } else if (number >= 75) {
            result = "Хорошо";
        } else if (number >= 60) {
            result = "Удовлетворительно";
        } else {
            result = "Неудовлетворительно";
        }
        return result;
    }
}
