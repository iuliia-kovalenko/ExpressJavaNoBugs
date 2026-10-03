package practice_9.stream;

import java.util.List;

public class SortedUniqueElements {
    public static void main(String[] args) {
        //list with duplicates
        //print all unique elements

        List<Integer> numbers = List.of(3,2,3,1,4,2,5);
        List<Integer> uniqueSorted = numbers.stream()
                .distinct()
                .peek(n-> System.out.println("distinct: " + n))
                .sorted()
                .peek(n-> System.out.println("sorted: " + n))
                .toList();

        System.out.println(uniqueSorted);
    }
}
