public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, NotificationMethod method) {
        System.out.println("Notification sent via Email: " + message);
    }
}
