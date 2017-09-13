public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification emailNotification1 = new EmailNotification("subject", "body", "recipient", "smtpProvider");
        TextNotification textNotification1 = new TextNotification("subject", "body", "recipient", "smsProvider");

        emailNotification1.transport();
        textNotification1.transport();

        emailNotification1.setStatus("new status");

        emailNotification1.printSomeText("text from main call to method");

        Object emailNotificationClone = emailNotification1.clone();

        if( emailNotification1.equals(emailNotificationClone) ) {
            System.out.println("Clone is equal to original");
        } else {
            System.out.println("Clone is not equal to original");
        }

        ((EmailNotification)emailNotificationClone).setStatus("new updated different status");

        if( emailNotification1.equals(emailNotificationClone) ) {
            System.out.println("Clone is equal to original");
        } else {
            System.out.println("Clone is not equal to original");
        }

        EmailNotification en1 = new EmailNotification("subject", "body", "recipient", "smtpProvider1");
        EmailNotification en2 = new EmailNotification("subject", "body", "recipient", "smtpProvider");

        if( en1.equals(en2) ) {
            System.out.println("Clone is equal to original");
        } else {
            System.out.println("Clone is not equal to original");
        }

    }
}
