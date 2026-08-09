package practice_5;

public abstract class Transport implements Move{
    private int speed;
    private int capacity;

    public Transport(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }


    public int getCapacity() {
        return capacity;
    }

    public abstract void move();
}
