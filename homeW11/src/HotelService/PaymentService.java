package HotelService;

public class PaymentService {
    public void processPayment(String user, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + user);
        System.out.println("Payment successful!");
    }
}

