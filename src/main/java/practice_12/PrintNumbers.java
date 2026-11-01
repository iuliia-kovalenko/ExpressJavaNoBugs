package practice_12;

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {  // Ошибка: i <= вместо i < (печатает 6 чисел)
            printNumber(i);
        }
    }

    public static void printNumber(int number) {
        System.out.println(number + 1); // Ошибка: сдвиг значений
    }
}
