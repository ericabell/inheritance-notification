public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;

        printSomeText("called from textNotification constructor");
    }

    @Override
    public void transport() throws NoTransportException {
        // super.transport();

        System.out.println("Recipient: " + recipient + " smsPovider: " + smsProvider);
        System.out.println("Subject: " + super.getSubject() + " Body: " + super.getBody() + " CreatedAt: " + super.getCreatedAt());
    }
}
