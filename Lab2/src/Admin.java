public class Admin {
    private int id;
    private String name;
    private String role;

    public Admin(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver, boolean isActive) {
        driver.setAvailability(isActive);
        System.out.println("Driver status has been " + (isActive ? "activated" : "deactivated"));
    }

    public void manageRider(Rider rider, boolean isActive) {
        System.out.println("Rider status has been " + (isActive ? "activated" : "deactivated"));
    }

    public void viewTripHistory(TripHistory tripHistory) {
        tripHistory.showHistory();
    }

    public void handleDispute(Dispute dispute) {
        dispute.resolve();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
