// Abstract User class
public abstract class User {
    protected String id;
    protected String name;
    protected String location;
    protected double rating;

    public User(String id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Abstract method for all users
    public abstract void sendNotification(String message);
}
