package practice_6;

public class HotDish extends Dish {
    private String name;
    private int temperature;

    public HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Dish: " + name + ", temperature: " + temperature);
    }
}
