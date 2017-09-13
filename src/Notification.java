import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status = "default value";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void transport() throws NoTransportException {

    }

    public void showStatus() {
        System.out.println("status: " + status);
    }

    protected void printSomeText(String textToPrint) {
        System.out.println(textToPrint);
    }

}
