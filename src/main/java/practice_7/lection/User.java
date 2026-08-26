package practice_7.lection;

import java.util.*;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        System.out.println("-------HashSet----------");
        Set<User> users = new HashSet<>();
        User user1 = new User("alex", 30);
        User user2 = new User("alex", 30);
        User user3 = new User("yulia", 40);
        users.add(user1); // hashCode -> использует адрес памяти
        users.add(user2); // попадут в разные бакеты
        users.add(user3);
        for (User user : users) {
            System.out.print(user);
        }
        System.out.println(users);

        System.out.println("Size: " + users.size());
        System.out.println("-------LinkedHashSet----------");
        Set<User> users2 = new LinkedHashSet<>();
        users2.add(new User("alex", 30));
        users2.add(new User("anna", 25));
        users2.add(new User("bob", 40));
        users2.add(new User("alex", 30));
        System.out.println(users2);
    }
}
