package practice_5;

public class Ship extends Transport{
    public Ship(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move() {
        System.out.println("Swimming is started");
    }
}
