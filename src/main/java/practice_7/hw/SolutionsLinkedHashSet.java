package practice_7.hw;

import java.util.LinkedHashSet;
import java.util.Set;

public class SolutionsLinkedHashSet {
    public static void main(String[] args) {
        // Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        System.out.println("----------Task1-----------");
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("first");
        stringSet.add("second");
        stringSet.add("third");
        stringSet.add("fourth");
        stringSet.add("fifth");
        stringSet.add("fifth");

//        stringSet.forEach(System.out::println);
        for (String el : stringSet) {
            System.out.println(el);
        }

        //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
        System.out.println("----------Task2-----------");
        addUnique(stringSet, "seventh");
        stringSet.forEach(System.out::println);
        addUnique(stringSet, "seventh");
    }

    public static void addUnique(Set<String> set, String el) {
        boolean added = set.add(el);
        if (added) {
            System.out.println("Element: " + el + " added successfully");
        } else {
            System.out.println("This element: " + el + " is not unique");
        }
    }
}