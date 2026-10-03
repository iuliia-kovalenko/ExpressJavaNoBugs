package practice_9.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        IntStream stream = nums.stream()
                .filter(n -> {
                    System.out.println("Filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("Map to int: " + n);
                    return Integer.valueOf(n);
                });
        System.out.println("Stream created, but terminal operation has not created yet");
        int sum = stream.sum();

        System.out.println(sum);

        System.out.println("------------------------------------");
    }
}
