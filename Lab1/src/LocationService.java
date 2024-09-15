import java.util.List;

public class LocationService {

    Driver findNearestDriver(Rider rider, List<Driver> drivers) {
        for (Driver driver : drivers) {
            if (driver.available && driver.location.equals(rider.location)) {
                return driver;
            }
        }
        return null;
    }

    void updateDriverLocation(Driver driver, String newLocation) {
        driver.updateLocation(newLocation);
    }

    void updateRiderLocation(Rider rider, String newLocation) {
        rider.location = newLocation;
        System.out.println("Rider location updated to " + newLocation);
    }
}
