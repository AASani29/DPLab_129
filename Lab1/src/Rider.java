class Rider {
    int id;
    String name;
    String location;
    double rating;
    PaymentMethod preferredPaymentMethod;


    Rider(int id, String name, String location, PaymentMethod preferredPaymentMethod) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.preferredPaymentMethod = preferredPaymentMethod;
        this.rating = 0.0;
    }


    void requestRide(String pickup, String dropoff, RideType rideType) {
        System.out.println("Ride requested by " + name + " for " + rideType + " from " + pickup + " to " + dropoff);
    }


    void rateDriver(Driver driver, double rating) {
        driver.rating = (driver.rating + rating) / 2;
        System.out.println("Driver " + driver.name + " rated: " + rating);
    }


    void makePayment(double fare) {
        preferredPaymentMethod.processPayment(fare);
    }
}
