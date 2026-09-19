package practice_9.funcinterfaces;

import java.util.function.Supplier;

public class Task9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");

        Supplier<String> s1 = sb::toString;
        Supplier<String> s2 = () -> sb.append("B").toString();

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s1.get());
        System.out.println(s2.get());
//        System.out.println(s1.equals(s2));
    }
}
