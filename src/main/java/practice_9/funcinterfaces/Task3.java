package practice_9.funcinterfaces;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x + 2;
        Function<Integer, Integer> mul3 = x -> x * 3;

        System.out.println(add2.andThen(mul3).apply(5));
        System.out.println(add2.compose(mul3).apply(5));
    }
}
