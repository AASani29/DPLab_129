class Trip {
    int id;
    String pickupLocation;
    String dropOffLocation;
    RideType rideType;
    String status;
    double fare;
    double distance;
    Driver driver;
    Rider rider;
    NotificationService notificationService;

    Trip(int id, String pickupLocation, String dropOffLocation, RideType rideType, double distance, Rider rider, Driver driver, NotificationService notificationService) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.distance = distance;
        this.rider = rider;
        this.driver = driver;
        this.notificationService = notificationService;
        this.fare = calculateFare();
        this.status = "Scheduled";
    }

    double calculateFare() {
        double baseFare = 10;
        switch (rideType) {
            case CARPOOL: return baseFare * 0.8 * distance;
            case LUXURY: return baseFare * 2 * distance;
            case BIKE: return baseFare * 0.5 * distance;
            default: return baseFare * distance;
        }
    }


    void assignDriver() {
        driver.acceptRide();
        notificationService.sendNotification("Driver Assigned for the trip.", NotificationMethod.IN_APP);
    }

    void completeTrip() {
        status = "Completed";
        driver.completeTrip();
        rider.makePayment(fare);
        notificationService.sendNotification("Trip completed. Payment processed.", NotificationMethod.IN_APP);
    }
}
