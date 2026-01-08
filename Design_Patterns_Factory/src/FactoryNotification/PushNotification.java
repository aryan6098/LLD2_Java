package FactoryNotification;

public class PushNotification extends Notification {
    private String recipient;
    private String sender;
    private String message;

    public PushNotification(String recipient,String message) {
        super(recipient, message);
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

//    @Override
//    public String getSender() {
//        return sender;
//    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent to device " + recipient);
        System.out.println("Message: " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
