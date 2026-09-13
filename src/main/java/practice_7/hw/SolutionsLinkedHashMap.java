package practice_7.hw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionsLinkedHashMap {
    public static void main(String[] args) {
        // Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        System.out.println("-------------Task1-----------");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "second");
        linkedHashMap.put(3, "third");
        linkedHashMap.put(4, "fourth");
        linkedHashMap.put(1, "first");
        linkedHashMap.put(5, "fifth");

        linkedHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        System.out.println("-------------Task1-----------");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Yulia", "8-909-555-55-55");
        phoneBook.addContact("Andrey", "8-922-111-44-44");
        phoneBook.addContact("Sohie", "8-066-444-33-22");
        phoneBook.addContact("Lidia", "8-909-555-55-55");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = sc.nextLine();
        phoneBook.findContact(name);

        //Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
        System.out.println("-------------Task3-----------");
        History history = new History();
        history.addNewElement("Page1", "Name1");
        history.addNewElement("Page2", "Name2");
        history.addNewElement("Page3", "Name3");
        history.addNewElement("Page4", "Name4");
        history.addNewElement("Page5", "Name5");
        history.addNewElement("Page6", "Name6");
        history.addNewElement("Page7", "Name7");
        history.addNewElement("Page8", "Name8");
        history.addNewElement("Page9", "Name9");
        history.addNewElement("Page10", "Name10");
        history.addNewElement("Page11", "Name11");
        history.printHistory();
    }
}

class PhoneBook {
    private LinkedHashMap<String, String> contacts;

    public PhoneBook() {
        this.contacts = new LinkedHashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("The phone of this contact: " + name + " is " + contacts.get(name));
        } else {
            System.out.println("Contact is not found");
        }
    }
}

class History {
    private LinkedHashMap<String, String> history;

    public History() {
        this.history = new LinkedHashMap<>();
    }

    public void addNewElement(String page, String pageName) {
        if (history.size() == 10 && !history.containsKey(page)) {
            String firstKey = history.keySet().stream().findFirst().get();
            history.remove(firstKey);
        }
        history.put(page, pageName);
    }

    public void printHistory() {
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println("Page: " + entry.getKey() + ", PageName: " + entry.getValue());
        }
    }
}
