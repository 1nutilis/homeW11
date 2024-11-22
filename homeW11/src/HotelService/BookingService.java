package HotelService;

import java.util.ArrayList;
import java.util.List;

class BookingService {
    private final List<String> bookings = new ArrayList<>();

    public void bookRoom(User user, Hotel hotel) {
        String booking = user.getUsername() + " booked a room in " + hotel.getName();
        bookings.add(booking);
        System.out.println(booking);
    }

    public List<String> getUserBookings(User user) {
        List<String> userBookings = new ArrayList<>();
        for (String booking : bookings) {
            if (booking.contains(user.getUsername())) {
                userBookings.add(booking);
            }
        }
        return userBookings;
    }
}
