public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();
        Notifier postalNotifier = new PostalAdapter(new PostalService());

        emailNotifier.notifyUser("email@example.com", "Email message");
        smsNotifier.notifyUser("+1234567890", "SMS message");
        postalNotifier.notifyUser("John Doe,123 Main St,10001", "Postal message");

    }
}
