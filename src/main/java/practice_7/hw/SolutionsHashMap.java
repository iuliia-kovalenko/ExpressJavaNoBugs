package practice_7.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionsHashMap {
    public static void main(String[] args) {
        //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        System.out.println("--------------Task1---------------");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yulia", 40);
        hashMap.put("Sophie", 18);
        hashMap.put("Lidia", 33);
        hashMap.put("Alex", 30);
        hashMap.put("Anton", 10);
        hashMap.put("Elena", 7);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
//        hashMap.forEach((key, value) ->
//            System.out.println("Name: " + key + " ->, Age"+

        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println("--------------Task2---------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = sc.nextLine();
        isNameExists(hashMap, name);

        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        System.out.println("--------------Task3---------------");
        printMinors(hashMap);

    }

    public static void isNameExists(HashMap<String, Integer> hashMap, String name) {
        if (hashMap.containsKey(name)) {
            System.out.println("This name: " + name + " exists in HashMap");
        } else {
            System.out.println("This name: " + name + " doesn't exist in HashMap");
        }
    }

    public static void printMinors(Map<String, Integer> map) {
        map.forEach((name, age) -> {
            if (age < 18) {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        });
    }
}