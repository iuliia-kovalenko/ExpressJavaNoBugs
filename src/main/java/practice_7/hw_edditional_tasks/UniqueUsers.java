package practice_7.hw_edditional_tasks;

import java.util.HashMap;

public class UniqueUsers {
    private HashMap<Integer, String> users;

    public UniqueUsers() {
        this.users = new HashMap<>();
    }

    public void addNewUser(Integer id, String name) {
        users.put(id, name);
    }

    public void userExists(Integer id) {
        boolean isExist = users.containsKey(id);
        if (isExist) {
            System.out.println("User " + users.get(id) + " with ID=" + id + " exists in Users");
        } else {
            System.out.println("User with ID=" + id + " doesn't exist in Users");
        }
    }

    public static void main(String[] args) {
        UniqueUsers uniqueUsers = new UniqueUsers();
        uniqueUsers.addNewUser(44, "Yulia");
        uniqueUsers.addNewUser(668, "Andrey");
        uniqueUsers.addNewUser(100, "Sophie");
        uniqueUsers.userExists(88);
        uniqueUsers.userExists(100);
    }
}