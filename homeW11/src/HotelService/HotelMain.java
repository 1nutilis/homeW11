package HotelService;

public class HotelMain {
    public static void main(String[] args) {

        BookingFacade bookingFacade = new BookingFacade();
        HotelBookingUI hotelBookingUI = new HotelBookingUI(bookingFacade);


        hotelBookingUI.startUI();
    }
}
