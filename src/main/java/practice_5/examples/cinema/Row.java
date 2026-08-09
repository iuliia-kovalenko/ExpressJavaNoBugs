package practice_5.examples.cinema;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Seat> seats = new ArrayList<>();
    private int number;

    public Row(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }
}