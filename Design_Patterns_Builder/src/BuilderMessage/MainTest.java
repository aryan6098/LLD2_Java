package BuilderMessage;

public class MainTest {
    public static void main(String[] args) {
        MessageBuilder messageBuilder = new MessageBuilder.Builder()
                .messageType(MessageType.TEXT)
                .content("Hello frm Builder")
                .sender("Raj")
                .recipient("Aryan")
                .isDelivered(true)
                .timestamp(System.currentTimeMillis())
                .build();

        System.out.println(messageBuilder.getMessageType());
        System.out.println(messageBuilder.getContent());
        System.out.println(messageBuilder.getSender());
        System.out.println(messageBuilder.getRecipient());
        System.out.println(messageBuilder.isDelivered());
        System.out.println(messageBuilder.getTimestamp());
    }
}
