package practice_5.examples.cinema;

public class Booking {
    private Customer customer;
    private Session session;
    private Row row;
    private Seat seat;

    public Booking(Customer customer, Session session, Row row, Seat seat) {
        this.customer = customer;
        this.session = session;
        this.row = row;
        this.seat = seat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Session getSession() {
        return session;
    }

    public Row getRow() {
        return row;
    }

    public Seat getSeat() {
        return seat;
    }
}
