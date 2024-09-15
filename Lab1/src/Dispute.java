public class Dispute {
    Rider rider;
    Driver driver;
    String issue;
    boolean resolved;


    Dispute(Rider rider, Driver driver, String issue) {
        this.rider = rider;
        this.driver = driver;
        this.issue = issue;
        this.resolved = false;
    }


    void resolve() {
        resolved = true;
        System.out.println("Dispute resolved between Rider: " + rider.name + " and Driver: " + driver.name);
    }
}
