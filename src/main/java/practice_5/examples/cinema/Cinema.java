package practice_5.examples.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<Hall> halls = new ArrayList<>();
    private List<Film> films = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();

    public Cinema(String name) {
        this.name = name;
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public boolean isAvailable(Session session, Row row, Seat seat) {
        return session.checkAvailability(row, seat);
    }

    public void bookSession(Customer customer, Session session, Row row, Seat seat) {
        if(!isAvailable(session, row, seat)) {
            System.out.println("Seat is not available");
            return;
        }
        Booking booking = new Booking(customer, session, row, seat);
        session.addBooking(booking);
    }
}
