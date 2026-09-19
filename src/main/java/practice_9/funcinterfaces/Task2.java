package practice_9.funcinterfaces;

import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("[" + s + "]");
        Consumer<String> c2 = s -> System.out.println("(" + s.length() + ")");

        c1.andThen(c2).accept("Java");
    }
}
