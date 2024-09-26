
public class Driver extends User {
    private String vehicleType;
    private boolean availability;

    public Driver(String id, String name, String vehicleType, String location, double rating, boolean availability) {
        super(id, name, location, rating);
        this.vehicleType = vehicleType;
        this.availability = availability;
    }

    public void acceptRide(Trip trip) {
        System.out.println("Driver " + this.name + " has accepted the ride.");
    }

    public void rateRider(Rider rider, double rating) { }

    public void startTrip(Trip trip) { }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification to Driver " + this.name + ": " + message);
    }

    public void setAvailability(boolean isActive) {

    }
}
