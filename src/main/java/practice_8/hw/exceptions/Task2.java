package practice_8.hw.exceptions;


/*
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
 Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
*/
public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        System.out.println(division(a,b));
    }

    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Division by 0 is forbidden");
            return 0;
        }
        return a / b;
    }
}

