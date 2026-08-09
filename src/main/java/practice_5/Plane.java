package practice_5;

public class Plane extends Transport{
    public Plane(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move() {
        System.out.println("Flying is started");
    }
}
