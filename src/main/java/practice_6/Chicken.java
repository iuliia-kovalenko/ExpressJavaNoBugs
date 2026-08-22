package practice_6;

public class Chicken extends FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Зерно");
    }

    @Override
    public void care() {
        System.out.println("Нуждается в кормушке");
    }

    @Override
    public void produce() {
        System.out.println("Несет яйца");
    }
}
