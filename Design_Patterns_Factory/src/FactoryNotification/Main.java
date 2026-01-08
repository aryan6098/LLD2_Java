package FactoryNotification;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification =  NotificationFactory.createNotification(NotificationType.EMAIL, "Aryan", "raj","Hi Aryan");
        emailNotification.sendNotification();

        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS, "Palak", "Saundrya", "Hi Palak, How's doing");
        smsNotification.sendNotification();
//        smsNotification.
        System.out.println("Notification Type: "+smsNotification.notificationType());
        System.out.println("Recipient: "+ smsNotification.getRecipient());
//        System.out.println("Sender: "+smsNotification.getSender());
        System.out.println("Message: "+ smsNotification.getMessage());
    }
}
