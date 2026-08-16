package practice_5;

public class Auto extends Transport{
    public Auto(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    public void move() {
        System.out.println("Driving is started");
    }
}
