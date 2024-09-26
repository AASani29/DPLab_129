public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver driver;
    private Rider rider;
    private NotificationService notificationService;

    public Trip(String id, String pickupLocation, String dropOffLocation, RideType rideType, double distance,
                Rider rider, NotificationService notificationService) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.distance = distance;
        this.rider = rider;
        this.notificationService = notificationService;
        this.status = "Pending";
    }


    public void calculateFare() {
        this.fare = rideType.calculateFare(this);
        System.out.println("Fare calculated: " + this.fare);
    }


    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Driver Assigned";


        notificationService.sendNotification("Driver assigned to your trip", rider, driver);

        driver.acceptRide(this); // Driver accepts the ride
        System.out.println("Driver " + driver.getName() + " has been assigned to trip.");
    }


    public void completeTrip() {
        this.status = "Completed";

        // Notify rider and driver
        notificationService.sendNotification("Your trip has been completed", rider, driver);

        System.out.println("Trip completed.");
    }


    public String getId() {
        return id;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public RideType getRideType() {
        return rideType;
    }

    public String getStatus() {
        return status;
    }

    public double getFare() {
        return fare;
    }

    public double getDistance() {
        return distance;
    }

    public Driver getDriver() {
        return driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
