package practice_8.hw.generics;

public class GenericMethods {
    public static <T> void printArray(T[] items) {
        for (T el: items) {
            System.out.println(el);
        }
    }
}
