package practice_5.examples.cinema;

public class Seat {
    private int number;
    private SeatType type;

    public Seat(int number, SeatType type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public SeatType getType() {
        return type;
    }
}
