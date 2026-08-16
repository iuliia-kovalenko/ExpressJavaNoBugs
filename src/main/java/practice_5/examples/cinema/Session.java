package practice_5.examples.cinema;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private Hall hall;
    private Film film;
    private LocalDateTime dateTime;
    private List<Booking> bookings = new ArrayList<>();

    public Session(Hall hall, Film film, LocalDateTime dateTime) {
        this.hall = hall;
        this.film = film;
        this.dateTime = dateTime;
    }

    public Hall getHall() {
        return hall;
    }

    public Film getFilm() {
        return film;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public boolean checkAvailability(Row row, Seat seat) {
        for (Booking booking : bookings) {
            if (booking.getRow().getNumber() == row.getNumber()
                    && booking.getSeat().getNumber() == seat.getNumber()) {
                return false;
            }
        }
        return true;
    }
}
