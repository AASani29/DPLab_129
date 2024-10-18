public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(String receiver, String message) {
        System.out.println("Email to: " + receiver + " | Message: " + message);
    }
}