package practice_7.hw_edditional_tasks;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public void getPhoneByName(String name) {
        if (contacts.containsKey(name)) {
            String phone = contacts.get(name);
            System.out.println(name + " phone: " + phone);
        } else {
            System.out.println("There is no such contact in PhoneBook");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Yulia", "1233455666");
        phoneBook.addContact("Anton", "7563784648");
        phoneBook.addContact("Sophie", "656566575");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = sc.nextLine();
        phoneBook.getPhoneByName(name);
    }
}
