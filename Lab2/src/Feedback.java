public class Feedback {
    double rating;
    String comment;


    Feedback(double rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }


    void showFeedback() {
        System.out.println("Rating: " + rating + " | Comment: " + comment);
    }
}
