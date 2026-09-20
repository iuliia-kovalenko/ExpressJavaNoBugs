package practice_9.hw.part_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamAggregateOperations {
    public static void main(String[] args) {
        System.out.println("-------------Task1----------------");
        //1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.

        List<Integer> listTask1 = List.of(1, 3, 4, 500, 6, 77);
        System.out.println(getMax(listTask1));

        System.out.println("-------------Task2----------------");
        //1. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое маленькое число, используя Stream API.

        List<Integer> listTask2 = List.of(1, 3, 4, 500, -6, 77);
        System.out.println(getMin(listTask2));

        System.out.println("-------------Task3----------------");
        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.

        List<Integer> listTask3 = List.of(1, 3, 4, 500);
        System.out.println(getSum(listTask3));

        System.out.println("-------------Task4----------------");
        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк и находит первую строку,
        // начинающуюся на букву "Б", используя Stream API.

        List<String> listTask4 = List.of("Алекс", "Светлана", "Борис", "Бреслав");
        System.out.println(findFirstElement(listTask4));

        System.out.println("-------------Task5----------------");
        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
        // который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.

        List<Integer> listTask5 = List.of(1, 3, 40, 503);
        System.out.println(checkIsEven(listTask5));
    }

    public static Integer getMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
    }

    public static Integer getMin(List<Integer> numbers) {
        return numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
    }

    public static Integer getSum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }

    public static Optional<String> findFirstElement(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
    }

    public static boolean checkIsEven(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(n -> n % 2 == 0);
    }
}
