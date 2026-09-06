package practice_8.hw.exceptions;


/*
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
 Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
*/
public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try {
            System.out.println(division(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is forbidden " + e.getMessage());
        }
    }

    static int division(int a, int b) {
        return a / b;
    }
}

