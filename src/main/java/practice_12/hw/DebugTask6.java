package practice_12.hw;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }


    public static void countdown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
}
