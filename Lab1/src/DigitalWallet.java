public class DigitalWallet implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via Digital Wallet.");
    }
}
