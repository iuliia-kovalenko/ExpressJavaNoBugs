package practice_7.lection;

import java.util.*;

public class UserHashMap {
    private String name;
    private int age;

    public UserHashMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserHashMap that = (UserHashMap) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "UserHashMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Map<UserHashMap, String> map = new HashMap<>();

        UserHashMap user1 = new UserHashMap("alex", 30);
        UserHashMap user2 = new UserHashMap("alex", 30);

        map.put(user1, "First"); // hashCode = 123 -> bucket = 0
        map.put(user2, "Second"); // hashCode = 456, bucket = 1

        System.out.println(map);
        System.out.println(map.size());
        for (Map.Entry<UserHashMap, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Map<String, String> capitals = new LinkedHashMap<>();
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin2.0");
        System.out.println(capitals);
        for (Map.Entry<String, String> entry: capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Map<Integer, String> users = new TreeMap<>();
        users.put(1003, "bob");
        users.put(1001, "alice");
        users.put(1002, "charlie");
        users.put(1001, "alex");

        for (Map.Entry<Integer, String> entry: users.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
