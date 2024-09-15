public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();


        NotificationService notificationService = new InAppNotificationService();


        Rider rider = new Rider(1, "Alice", "Downtown", paypal);
        Driver driver = new Driver(101, "Bob", "Luxury", "Uptown");

        Vehicle luxuryCar = new Vehicle("Luxury Car", "AB1234", 4);


        Admin admin = new Admin(201, "John", "Manager");


        rider.requestRide("Downtown", "Uptown", RideType.LUXURY);


        Trip trip = new Trip(1, "Downtown", "Uptown", RideType.LUXURY, 15.0, rider, driver, notificationService);
        trip.assignDriver();


        driver.startTrip();
        trip.completeTrip();


        rider.rateDriver(driver, 5);
        driver.rateRider(rider, 5);


        TripHistory tripHistory = new TripHistory();
        tripHistory.addTrip(trip);
        admin.viewTripHistory(tripHistory);


        Dispute dispute = new Dispute(rider, driver, "Late arrival");
        admin.handleDispute(dispute);
    }
}