package practice_8.generics.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SolutionsGenerics {
    public static void main(String[] args) {
        Collection<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        System.out.println(stringList.getClass() == integerList.getClass());
    }
}

class Box1<T extends Number> {
    private T value;

    public Box1() {
//        value = new T();
//        T[] arr = new T[10];
    }
}



