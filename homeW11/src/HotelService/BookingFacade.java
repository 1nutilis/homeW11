package HotelService;

import java.util.List;

class BookingFacade {
    private final HotelService hotelService = new HotelService();
    private final BookingService bookingService = new BookingService();
    private final NotificationService notificationService = new NotificationService();

    public void addHotel(Hotel hotel) {
        hotelService.addHotel(hotel);
    }

    public List<Hotel> searchHotels(String location) {
        return hotelService.searchHotels(location);
    }

    public void bookHotel(User user, Hotel hotel) {
        bookingService.bookRoom(user, hotel);
        notificationService.sendNotification(user, "Your booking at " + hotel.getName() + " is confirmed.");
    }

    public List<String> getUserBookings(User user) {
        return bookingService.getUserBookings(user);
    }

    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }
}