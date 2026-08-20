package practice_6;

public class Cow extends FarmAnimal{
    @Override
    public void feed() {
        System.out.println("ест траву");
    }

    @Override
    public void care() {
        System.out.println("Выпас");
    }

    @Override
    public void produce() {
        System.out.println("Дает молоко");
    }
}
