class Driver {
    int id;
    String name;
    String vehicleType;
    String location;
    double rating;
    boolean available;


    Driver(int id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = 0.0;
        this.available = true;
    }


    void acceptRide() {
        available = false;
        System.out.println("Driver " + name + " accepted the ride.");
    }


    void rateRider(Rider rider, double rating) {
        rider.rating = (rider.rating + rating) / 2;
        System.out.println("Rider " + rider.name + " rated: " + rating);
    }


    void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Driver location updated to " + newLocation);
    }


    void startTrip() {
        System.out.println("Trip started by " + name);
    }


    void completeTrip() {
        available = true;
        System.out.println("Trip completed by " + name);
    }
}
