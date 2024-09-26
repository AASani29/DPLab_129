public class Rider extends User {
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, String location, double rating, PaymentMethod preferredPaymentMethod) {
        super(id, name, location, rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void requestRide(String pickupLocation, String dropOffLocation, RideType rideType, NotificationService notificationService) {

    }

    public void rateDriver(Driver driver, double rating) { }

    public void makePayment(Trip trip) {
        this.preferredPaymentMethod.processPayment(trip);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification to Rider " + this.name + ": " + message);
    }
}
