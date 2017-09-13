public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        // super.transport();

        System.out.println("Recipient: " + recipient + " smtpProvider: " + smtpProvider);
        System.out.println("Subject: " + super.getSubject() + " Body: " + super.getBody() + " CreatedAt: " + super.getCreatedAt());
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    @Override
    public void printSomeText(String textToPrint) {
        super.printSomeText(textToPrint);
        System.out.println("This is some text in EmailNotification method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        EmailNotification clonedEmailNotification = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider() );

        return clonedEmailNotification;
    }
}
