package practice_9.hw.part_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        System.out.println("---------------Task1---------------------");
        //1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.

        List<String> list1 = List.of("first", "second", "first", "third", "fourth", "fifth", "fourth", "fifth", "9", "9");
        System.out.println(groupByFirstLetter(list1));

        System.out.println("---------------Task2---------------------");
        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.

        List<Integer> list2 = List.of(1, 11, 23, 50, 3, 66, 13);
        System.out.println(groupByEvenOdd(list2));

        System.out.println("---------------Task3---------------------");
        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.

        List<Integer> list3 = List.of(20, 30, 7);
        System.out.println(averageValue(list3));
    }

    public static Map<Character, List<String>> groupByFirstLetter(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
    }

    public static Map<String, List<Integer>> groupByEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
    }

    public static Double averageValue(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);
    }
}
