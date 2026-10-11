package practice_10.solutions;

public class Task10 {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Task");
        };

        System.out.println("Main");
    }
}
