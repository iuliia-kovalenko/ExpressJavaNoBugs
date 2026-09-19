package practice_8.generics.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

class Task1 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);

        Box raw = intBox;
        raw.set("Hello");
        System.out.println(intBox.get());

//        Integer x = intBox.get(); //classCastException
        Object x = intBox.get();
        System.out.println(x);
    }
}

class Task2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass());
        System.out.println(list1 instanceof ArrayList<?>);
//        System.out.println(list1 instanceof ArrayList<Integer>);
    }
}

class Task3 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        List<? extends Number> up = ints;
        Number n = up.get(0);

        List<? super Integer> down = new ArrayList<Number>();
        down.add(10);
        Object obj = down.get(0);

        System.out.println(n); //1
        System.out.println(obj); //10
    }
}

class Task4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Yulia");
//        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        addWrong(names);
//        addWrong(nums);
//
        for (String name : names) {
            System.out.println(name); // ClassCastException
        }
//
//        for (Integer name: nums) {
//            System.out.println(name); // ClassCastException
//        }
    }

    private static void addWrong(List list) {
        list.add(10);
    }
}

class Task5 {
//    public static void print(List<String> list) {
//        System.out.println("List of string");
//    }

    public static void print(List<Integer> list) {
        System.out.println("List of integers");
    }

    public static void main(String[] args) {
//        print(List.of("a", "b", "c"));
    }
}

class Task6 {
    public static <T> T pick(T a, T b) {
        return a != null ? a : b;
    }

    public static void main(String[] args) {
        java.io.Serializable s = "text";
        Object o = 123;

        Object result = pick(s, o);
        System.out.println(result.getClass().getName());
    }
}