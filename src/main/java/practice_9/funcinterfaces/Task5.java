package practice_9.funcinterfaces;

import java.util.function.BiFunction;

public class Task5 {
    public static void main(String[] args) {
        BiFunction<String, String, String> f = (a,b) -> {
            System.out.print("f ");
            return a + b;
        };

        String r = f.apply("A", "B") + f.apply("C", "D");
        System.out.println();
        System.out.println(r);
    }
}
