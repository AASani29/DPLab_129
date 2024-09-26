import java.util.ArrayList;
import java.util.List;

public class TripHistory {
    List<Trip> completedTrips = new ArrayList<>();


    void addTrip(Trip trip) {
        completedTrips.add(trip);
    }


    void showHistory() {
        System.out.println("Showing all completed trips:");
        for (Trip trip : completedTrips) {
          //  System.out.println("Trip ID: " + trip.id + " | Pickup: " + trip.pickupLocation + " | Drop-off: " + trip.dropOffLocation + " | Fare: $" + trip.getFare());
        }
    }
}
