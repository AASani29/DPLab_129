public class Admin {
    int id;
    String name;
    String role;


    Admin(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    void manageDriver(Driver driver, boolean isActive) {
        driver.available = isActive;
        System.out.println("Driver " + driver.name + " has been " + (isActive ? "activated" : "deactivated"));
    }

    void manageRider(Rider rider, boolean isActive) {
        System.out.println("Rider " + rider.name + " has been " + (isActive ? "activated" : "deactivated"));
    }

    void viewTripHistory(TripHistory tripHistory) {
        tripHistory.showHistory();
    }

    void handleDispute(Dispute dispute) {
        dispute.resolve();
    }
}
