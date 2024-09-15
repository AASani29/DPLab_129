public class InAppNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, NotificationMethod method) {
        System.out.println("In-App Notification: " + message);
    }
}
