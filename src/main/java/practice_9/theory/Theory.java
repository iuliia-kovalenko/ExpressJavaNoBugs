package practice_9.theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Theory {
    public static void main(String[] args) {
        Predicate<Integer> isMoreThanFive = x -> x > 5;
        System.out.println(isMoreThanFive.test(1));
        System.out.println(isMoreThanFive.test(8));

        Function<String, Integer> getLength = str -> str.length();
//        Function<String, Integer> getLength = String::length;
        System.out.println(getLength.apply("abc"));

        Consumer<String> printer = message -> System.out.println("Message: " + message);
        printer.accept("Hello! World");

//        Supplier<Double> random = () -> Math.random();
        Supplier<Double> random = Math::random;
        System.out.println(random.get());

        System.out.println("---------------STREAM-API---------------");
        List<String> names = Arrays.asList("Anna", "Boris", "Sasha");
        List<String> filtered = new ArrayList<>();
        for (String name: names) {
            if (name.startsWith("A")) {
                filtered.add(name.toUpperCase());
            }
        }

        List<String> names1 = Arrays.asList("Anna", "Boris", "Alexandra");
        List<String> filtered1 = names1.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase) //(name -> name.toUpperCase)
                .collect(Collectors.toList()); //toList();

        Stream<String> stream = names1.stream()
                .map(name -> {
                    System.out.println("map: " + name);
                    return name.toUpperCase();
                })
                .filter(name -> {
                    System.out.println("filter: " + name);
                    return name.length() > 5;
                });

        System.out.println("- Stream created, but operations have not yet done -");

        stream.forEach(name -> System.out.println("forEach: " + name));
    }
}
