package practice_6;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void infoMenu() {
        System.out.println(name);
        for (Dish dish : dishes) {
            dish.getDescription();
        }
    }
}
