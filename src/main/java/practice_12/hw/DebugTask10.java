package practice_12.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Anna"));
        names.removeIf(string -> string.startsWith("A"));
        names.forEach(System.out::println);
    }
}