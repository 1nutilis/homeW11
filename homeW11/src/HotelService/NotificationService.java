package HotelService;

class NotificationService {
    public void sendNotification(User user, String message) {
        System.out.println("Notification to " + user.getUsername() + ": " + message);
    }
}
