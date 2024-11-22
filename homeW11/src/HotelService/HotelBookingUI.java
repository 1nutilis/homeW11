package HotelService;

import java.util.List;
import java.util.Scanner;

public class HotelBookingUI {
    private static BookingFacade bookingFacade;
    private static Scanner scanner;
    private User currentUser;


    public HotelBookingUI(BookingFacade bookingFacade) {
        HotelBookingUI.bookingFacade = bookingFacade;
        scanner = new Scanner(System.in);
    }


    public void startUI() {
        setupSampleData();
        System.out.println("Welcome to the Hotel Booking System!");


        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        currentUser = new User(username);

        boolean exit = false;
        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1 -> viewAllHotels();
                case 2 -> searchHotelsByLocation();
                case 3 -> bookHotel();
                case 4 -> viewBookings();
                case 5 -> exit = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Hotel Booking System. Goodbye!");
    }


    private void setupSampleData() {
        bookingFacade.addHotel(new Hotel("Ocean View", "Miami"));
        bookingFacade.addHotel(new Hotel("Mountain Lodge", "Denver"));
        bookingFacade.addHotel(new Hotel("City Lights", "New York"));
    }


    private void showMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. View all hotels");
        System.out.println("2. Search hotels by location");
        System.out.println("3. Book a hotel");
        System.out.println("4. View my bookings");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }


    private void viewAllHotels() {
        List<Hotel> hotels = bookingFacade.getAllHotels();
        System.out.println("\nAll Available Hotels:");
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }


    private void searchHotelsByLocation() {
        System.out.print("\nEnter location to search: ");
        String location = scanner.nextLine();
        List<Hotel> hotels = bookingFacade.searchHotels(location);
        if (hotels.isEmpty()) {
            System.out.println("No hotels found in " + location);
        } else {
            System.out.println("Hotels in " + location + ":");
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
            }
        }
    }


    private void bookHotel() {
        System.out.print("\nEnter location to search: ");
        String location = scanner.nextLine();
        List<Hotel> hotels = bookingFacade.searchHotels(location);
        if (hotels.isEmpty()) {
            System.out.println("No hotels found in " + location);
        } else {
            System.out.println("Hotels in " + location + ":");
            for (int i = 0; i < hotels.size(); i++) {
                System.out.println((i + 1) + ". " + hotels.get(i));
            }
            System.out.print("Select a hotel to book (1-" + hotels.size() + "): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (choice > 0 && choice <= hotels.size()) {
                Hotel selectedHotel = hotels.get(choice - 1);
                bookingFacade.bookHotel(currentUser, selectedHotel);
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }


    private void viewBookings() {
        List<String> bookings = bookingFacade.getUserBookings(currentUser);
        if (bookings.isEmpty()) {
            System.out.println("\nYou have no bookings.");
        } else {
            System.out.println("\nYour Bookings:");
            for (String booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}
