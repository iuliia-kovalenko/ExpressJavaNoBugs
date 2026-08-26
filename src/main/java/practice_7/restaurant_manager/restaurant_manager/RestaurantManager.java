package practice_7.restaurant_manager.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    // addLast, getFromFirst, delete in any place

    private LinkedList<String> orders;

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    public void addOrder(String order) {
        orders.addLast(order);
    }

    public String getNextOrderForProcess() {
        return orders.poll();
    }

    public void deleteOrder(String order) {
        orders.remove(order);
    }
    public void printOrders() {
        System.out.println("All orders: ");
        orders.forEach(System.out::println);
    }

    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        manager.addOrder("French fries");
        manager.addOrder("Chicken burger");
        manager.printOrders();
        manager.getNextOrderForProcess();
        manager.printOrders();
        manager.addOrder("French fries");
        manager.addOrder("Spagetti");
        manager.printOrders();
        manager.deleteOrder("French fries");
        manager.printOrders();



    }
}
