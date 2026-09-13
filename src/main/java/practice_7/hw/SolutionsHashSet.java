package practice_7.hw;

import java.util.*;

public class SolutionsHashSet {
    public static void main(String[] args) {
        //Создайте HashSet из 5 чисел и выведите его содержимое.
        System.out.println("-------------Task1--------------");
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(5);
        integerSet.forEach(System.out::println);

        //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        System.out.println("-------------Task2--------------");
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numberSet.add(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        Integer enteredNum = sc.nextInt();

        if (numberSet.contains(enteredNum)) {
            System.out.println("Set contains number: " + enteredNum);
        } else {
            System.out.println("Set doesn't contain number: " + enteredNum);
        }

        //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
        System.out.println("-------------Task3--------------");
        List<String> stringList = new LinkedList<>(Arrays.asList("first", "second", "third", "last", "third", "second"));
        System.out.println("----------List with duplicates-----------");
        stringList.forEach(System.out::println);
        System.out.println("----------Set without diplicates-----------");
        uniqueElements(stringList).forEach(System.out::println);

        //Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет,
        // содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
        System.out.println("-------------Task4--------------");
        Set<String> names = new HashSet<>(List.of("Yulia", "Anton", "Sophie", "Alex"));
        System.out.print("Enter any name: ");
        sc.nextLine();
        String enteredName = sc.nextLine();
        if (names.contains(enteredName)) {
            System.out.println("Name: " + enteredName + " exists in set");
        } else {
            System.out.println("Name: " + enteredName + " doesn't exist in set");
        }
    }

    public static Set<String> uniqueElements(List<String> stringList) {
        return new HashSet<>(stringList);
    }
}
