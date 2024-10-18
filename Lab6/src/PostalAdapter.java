public class PostalAdapter implements Notifier {
    private final PostalService postalService;

    public PostalAdapter(PostalService postalService) {
        this.postalService = postalService;
    }

    @Override
    public void notifyUser(String receiver, String message) {
        String[] details = receiver.split(",", 3);
        String name = details.length > 0 ? details[0] : "";
        String address = details.length > 1 ? details[1] : "";
        String postalCode = details.length > 2 ? details[2] : "";

        postalService.sendMail(name, address, postalCode, message);
    }
}
