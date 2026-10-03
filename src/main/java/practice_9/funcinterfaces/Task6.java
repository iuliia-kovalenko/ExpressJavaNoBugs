package practice_9.funcinterfaces;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Task6 {
    public static void main(String[] args) {
        Supplier<Integer> s1 = () -> 127;
        Supplier<Integer> s2 = () -> 128;

        Integer a1 = s1.get();
        Integer a2 = s1.get();

        Integer b1 = s2.get();
        Integer b2 = s2.get();

        System.out.println(a1 == a2);
        System.out.println(b1 == b2);
        System.out.println(a1.equals(a2));
        System.out.println(b1.equals(b2));
    }
}
