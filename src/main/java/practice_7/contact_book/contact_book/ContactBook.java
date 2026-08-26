package practice_7.contact_book.contact_book;

import java.util.HashMap;

public class ContactBook {
    // key-value -> name, phone
    // search contact by name
    // update phone by name

    private HashMap<String, String> contacts;

    public ContactBook(){
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public String getPhoneByName(String name) {
        return contacts.get(name);
    }

    public void updatePhone(String name, String phone) {
        contacts.put(name, phone);
    }

    @Override
    public String toString() {
        return "ContactBook{" +
                "contacts=" + contacts +
                '}';
    }

    public void printContacts() {
        System.out.println("All contacts: ");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("Name: " + name + ", phone: " + phone);
        });
        System.out.println("------------");
    }

    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        book.addContact("Yulia", "8-911-999-99-00");
        book.addContact("Alex", "8-911-888-77-00");
        book.printContacts();
        book.updatePhone("Alex", "8-000-000-00-00");
        book.printContacts();
    }
}
