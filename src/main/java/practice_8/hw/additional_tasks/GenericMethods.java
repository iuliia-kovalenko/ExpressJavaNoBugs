package practice_8.hw.additional_tasks;

import java.util.List;
import java.util.Map;

public class GenericMethods {
    public static <T> void printList(List<T> list) {
        for (T el: list) {
            System.out.println(el);
        }
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number el: list) {
            sum += el.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(2);
        list.add(3);
        list.add(5);
    }

    public static <K, V> void printMap(Map<K,V> map) {
        map.forEach((k,v) -> System.out.println("key: " + k + ", value " + v));
    }
}
