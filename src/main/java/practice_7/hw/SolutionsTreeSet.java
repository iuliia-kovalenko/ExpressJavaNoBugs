package practice_7.hw;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class SolutionsTreeSet {
    public static void main(String[] args) {
        // Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
        System.out.println("-------------Task1------------");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(6);
        treeSet.forEach(System.out::println);

        //Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
        System.out.println("-------------Task2------------");
        addUnique(treeSet, 6);
        addUnique(treeSet, 60);

        //Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        System.out.println("-------------Task3------------");

        TreeSet<Integer> integersTreeSet = new TreeSet<>();
        integersTreeSet.add(2);
        integersTreeSet.add(20);
        integersTreeSet.add(17);
        integersTreeSet.add(77);
        integersTreeSet.add(1);
        integersTreeSet.add(13);

        getHigherAndLowerNumber(integersTreeSet, 3);
        getHigherAndLowerNumber(integersTreeSet, 78);
    }

    public static void getHigherAndLowerNumber(TreeSet<Integer> treeSet, Integer num) {
        Integer lowerNumber = treeSet.lower(num);
        Integer higherNumber = treeSet.higher(num);

        if (lowerNumber != null && higherNumber != null) {
            System.out.println("Lower number than " + num + " is " + lowerNumber);
            System.out.println("Higher number than " + num + " is " + higherNumber);
        } else {
            System.out.println("Higher or lower number is null");
        }
    }

    public static void addUnique(TreeSet<Integer> treeSet, Integer number) {
        if (!treeSet.contains(number)) {
            treeSet.add(number);
            System.out.println("Number " + number + " was added in set");
        } else {
            System.out.println("This number " + number + " is not unique, it's already in set");
        }
    }
}
