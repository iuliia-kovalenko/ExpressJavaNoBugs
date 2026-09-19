package practice_9.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solutions {
    public static void main(String[] args) {
        var list = List.of("a1", "b2", "a2");

        list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

        var s = Stream.of(1, 2, 3);

        System.out.println(s.count());
//        s.forEach(System.out::println); // stream s closed!!!!!!

        int r = IntStream.rangeClosed(1, 4)
                .reduce(10, (a, b) -> a - b);

        System.out.println(r);

        System.out.println("---------------------");
        var lists = List.of(
                List.of("a", "b"),
                List.of("c"),
                List.of("d", "e")
        );

        System.out.println(
                lists.stream()
                        .map(List::stream)
                        .count()
        );

        System.out.println(
                lists.stream()
                        .flatMap(List::stream)
                        .count()
        );

        System.out.println("-------------------");
        var lines = List.of("java stream", "flat map");

        lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .forEach(System.out::println);

        System.out.println("-------------------");

        Stream.of(2, 4, 6, 1, 8, 10)
                .takeWhile(x -> x % 2 == 0)
                .forEach(System.out::println);

        System.out.println("-------------------");

        Stream.of("a", "b", "c", "c", "a", "d")
                .distinct()
                .limit(3)
                .forEach(System.out::println);


        System.out.println("-------------------");

        var result = IntStream.of(3, 2, 1)
                .peek(x -> System.out.println("peek1: " + x))
                .sorted()
                .peek(x -> System.out.println("peek2: " + x))
                .sum();

        System.out.println("sum= " + result);

        System.out.println("-------------------");

        var list1 = List.of(1, 2, 3, 4, 5);

        list1.parallelStream().forEach(System.out::print);
        System.out.println();

        list1.parallelStream().forEachOrdered(System.out::print);
        System.out.println();

        System.out.println("------------------");
        var list2 = List.of("aa", "ab", "ac");

//        var m = list2.stream()
//                .collect(Collectors.toMap(
//                        s1 -> s1.substring(0,1),
//                        s1 -> s1
//                ));
//
//        System.out.println(m);

        var m2 = list2.stream()
                .collect(Collectors.toMap(
                        s3 -> s3.substring(0, 1),
                        s3 -> s3,
                        (left, right) -> left)
                );
        System.out.println(m2);

        var m3 = list2.stream()
                .collect(Collectors.toMap(
                        s3 -> s3.substring(0, 1),
                        s3 -> s3,
                        (left, right) -> {
                            if (left.charAt(1) != 'b') {
                                return "new";
                            } else {
                                return left;
                            }
                        })
                );
        System.out.println(m3);

        System.out.println("---------------------");
        var list3 = List.of("aa", "ab", "ac", "ds", "fd", "dd");

        var m4 = list3.stream()
                .collect(Collectors.groupingBy(s4 -> s4.substring(0, 1)));

        System.out.println(m4);
    }
}
