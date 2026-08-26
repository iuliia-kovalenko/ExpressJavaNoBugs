package practice_7.lection;

import java.util.Set;
import java.util.TreeSet;

public class UserTreeSet implements Comparable<UserTreeSet> {
    private String name;
    private int age;

    public UserTreeSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(UserTreeSet other) {
       int cmp = this.name.compareTo(other.name);

       if (cmp == 0) {
           return Integer.compare(this.age, other.age);
       }
       return cmp;
    }

    @Override
    public String toString() {
        return "UserTreeSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Set<UserTreeSet> users = new TreeSet<>();
        users.add(new UserTreeSet("bob", 40));
        users.add(new UserTreeSet("alex", 30));
        System.out.println(users);
        users.add(new UserTreeSet("anna", 25));
        System.out.println(users);
        users.add(new UserTreeSet("alex", 30));
        System.out.println(users);
        users.add(new UserTreeSet("alex", 31));
        System.out.println(users);
    }
}
