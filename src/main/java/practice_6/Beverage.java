package practice_6;

public class Beverage extends Dish {
    private String name;
    private int volume;

    public Beverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Beverage: " + name + ", volume: " + volume);
    }
}
