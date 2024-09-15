public class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}
