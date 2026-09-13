package practice_8.hw.additional_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Task1--------------");
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setItem("String");
        System.out.println(stringStorage.getItem());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setItem(133);
        System.out.println(integerStorage.getItem());

        System.out.println("-----------Task2--------------");
        List<String> list = new ArrayList<>(List.of("first", "second", "third"));
        GenericMethods.printList(list);

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        GenericMethods.printList(integerList);

        System.out.println("-----------Task3--------------");
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.addItem(1);
        integerNumberBox.addItem(1);
        integerNumberBox.addItem(1);
        System.out.println(integerNumberBox.getSum());

        NumberBox<Long> longNumberBox = new NumberBox<>();
        longNumberBox.addItem(10L);
        longNumberBox.addItem(10L);
        longNumberBox.addItem(10L);
        System.out.println(longNumberBox.getSum());

        System.out.println("-----------Task4--------------");
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(20);
        integerList1.add(20);
        integerList1.add(20);
        System.out.println(GenericMethods.sum(integerList1));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(1.0);
        doubleList.add(11.0);
        System.out.println(GenericMethods.sum(doubleList));

        System.out.println("-----------Task5--------------");

        List<Number> numberList = new ArrayList<>();
        GenericMethods.addNumbers(numberList);
        numberList.forEach(System.out::println);

        System.out.println("-----------Task6--------------");
        TestContainer<Integer> container = new TestContainer<>();
        container.add(44);
        System.out.println(container.get());

        TestContainer<String> container2 = new TestContainer<>();
        container2.add("first string");
        System.out.println(container2.get());

        System.out.println("-----------Task7--------------");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        GenericMethods.printMap(map);
    }
}
