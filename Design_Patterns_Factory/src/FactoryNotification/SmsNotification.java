package FactoryNotification;

public class SmsNotification extends Notification {

    private String recipient;
//    private String sender;
    private String message;


    public SmsNotification(String recipient,String message) {
        super(recipient, message);
        this.recipient = recipient;
//        this.sender = sender;
        this.message = message;
    }


    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipient + " from " );
        System.out.println("Message: " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
