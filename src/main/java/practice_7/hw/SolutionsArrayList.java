package practice_7.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionsArrayList {
    public static void main(String[] args) {
        //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
        System.out.println("-------------Task1-----------------");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        arrayList.add(6);
        arrayList.forEach(System.out::println);

        //Напишите программу, которая выводит все чётные числа из ArrayList.
        System.out.println("-------------Task2-----------------");
        ArrayList<Integer> arrayListNums = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            arrayListNums.add(i);
        }

        for (Integer num : arrayListNums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
        System.out.println("-------------Task3-----------------");
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("first", "secondjfsjhhsdhhsjjiiiiifh", "theLongestString", "short"));
        String maxEl = stringArrayList.get(0);
        Integer maxLength = maxEl.length();

        for (String el : stringArrayList) {
            if (el.length() > maxLength) {
                maxEl = el;
                maxLength = el.length();
            }
        }
        System.out.println(maxEl);

        //Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
        System.out.println("-------------Task4-----------------");
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for (Integer el : integerArrayList) {
            sum += el;
        }
        System.out.println("Sum of all elements is: " + sum);

        //Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        System.out.println("-------------Task5-----------------");
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 30, 4, 5, 696, 7, 8, 9, 10));

        Integer maxNumber = nums.get(0);
        for (Integer el : nums) {
            if (el > maxNumber) {
                maxNumber = el;
            }
        }
        System.out.println("Max number is: " + maxNumber);
    }
}
