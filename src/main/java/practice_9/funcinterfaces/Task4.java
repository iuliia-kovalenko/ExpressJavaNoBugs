package practice_9.funcinterfaces;

import java.util.function.Supplier;

public class Task4 {
    private static int counter = 0;

    public static void main(String[] args) {
        Supplier<Integer> s = () -> ++counter;

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}