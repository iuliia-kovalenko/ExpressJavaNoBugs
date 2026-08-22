package practice_6;

public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("гуляет");
    }
}
