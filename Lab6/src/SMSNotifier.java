public class SMSNotifier implements Notifier {
    @Override
    public void notifyUser(String receiver, String message) {
        System.out.println("SMS to: " + receiver + " | Message: " + message);
    }
}