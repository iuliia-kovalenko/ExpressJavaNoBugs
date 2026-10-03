package practice_9.funcinterfaces;

import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> {
            System.out.println("p1");
            return s.length() > 3;
        };

        Predicate<String> p2 = s -> {
            System.out.println("p2");
            return s.startsWith("A");
        };

        System.out.println(p1.and(p2).test("Ax"));
        System.out.println("------");
        System.out.println(p1.and(p2).test("Alex"));
    }
}
