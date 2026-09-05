package practice_7.hw;

import java.util.TreeMap;
import java.util.TreeSet;

public class SolutionsTreeMap {
    public static void main(String[] args) {
        //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
        System.out.println("-----------------Task1------------------");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Yulia", 100);
        treeMap.put("Alex", 88);
        treeMap.put("Sophie", 93);
        treeMap.put("Andrey", 90);
        treeMap.put("Sveta", 66);
        treeMap.forEach((name, score) ->
                System.out.println(name + " -> " + score));

        //Найдите минимальный и максимальный ключ в TreeMap.
        System.out.println("-----------------Task2------------------");
        System.out.println("Min key: " + treeMap.firstKey());
        System.out.println("Max key: " + treeMap.lastKey());

        //Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
        System.out.println("-----------------Task3------------------");
        Employee employee = new Employee();
        employee.addEmployee(100, "Yulia");
        employee.addEmployee(200, "Anton");
        employee.addEmployee(300, "Sergey");
        employee.addEmployee(400, "Sophie");
        employee.addEmployee(500, "Adrey");
        employee.getNearestEmployee(320);
    }
}

class Employee {
    private TreeMap<Integer, String> employees;

    public Employee() {
        this.employees = new TreeMap<>();
    }

    public void addEmployee(Integer id, String name) {
        employees.put(id, name);
    }

    public void getNearestEmployee(Integer id) {
        Integer nearestId = employees.higherKey(id);
        if (nearestId == null) {
            System.out.println("This is the highest ID by itself");
        } else {
            System.out.println("The nearest ID is: " + nearestId);
        }
    }
}
