package FactoryNotification;

public abstract class Notification {
    private String recipient;
//    private String sender;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
//        this.sender = sender;
        this.message = message;
    }

    public String getRecipient() {
        return this.recipient;
    }

//    public String getSender() {
//        return this.sender;
//    }

    public String getMessage() {
        return this.message;
    }

    public abstract void sendNotification();

    public abstract NotificationType notificationType();
}
