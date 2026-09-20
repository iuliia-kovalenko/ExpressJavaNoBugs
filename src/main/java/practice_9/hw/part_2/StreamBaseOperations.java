package practice_9.hw.part_2;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBaseOperations {
    public static void main(String[] args) {
        System.out.println("------------Task1---------------");
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.

        List<String> list1 = List.of("first", "second", "third", "fourth", "fifth");
        List<String> resultTask1 = filterLengthMoreThanFive(list1);
        System.out.println(resultTask1);

        System.out.println("------------Task2---------------");
        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        List<Integer> list2 = List.of(5, 3, 23, 55, 100, 255, 1);
        System.out.println(filterNumbersDividedByFive(list2));

        System.out.println("------------Task3---------------");
        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину,
        // используя Stream API.

        List<String> list3 = List.of("first", "second", "third", "fourth", "fifth");
        System.out.println(mapStringToLength(list3));

        System.out.println("------------Task4---------------");
        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
        // где каждое число заменено на его квадрат, используя Stream API.

        List<Integer> list4 = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(mapNumbersToSquare(list4));

        System.out.println("------------Task5---------------");
        //5. Удаление дубликатов из списка
        //Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.

        List<String> list5 = List.of("first", "second", "first", "third", "fourth", "fifth", "fourth", "fifth", "9", "9");
        System.out.println(uniqueElements(list5));
    }

    public static List<String> filterLengthMoreThanFive(List<String> list) {
        return list.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersDividedByFive(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> mapStringToLength(List<String> list) {
        return list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

    public static List<Integer> mapNumbersToSquare(List<Integer> numbers) {
        return numbers.stream()
                .map(s -> s * s)
                .collect(Collectors.toList());
    }

    public static List<String> uniqueElements(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
