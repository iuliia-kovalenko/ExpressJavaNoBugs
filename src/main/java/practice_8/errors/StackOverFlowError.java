package practice_8.errors;

public class StackOverFlowError {
    public static void main(String[] args) {
        recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println(num);
        recursivePrint(num + 1); // рекурсивный вызов без условия выхода
    }
}
