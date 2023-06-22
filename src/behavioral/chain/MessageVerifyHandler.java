package behavioral.chain;

public class MessageVerifyHandler extends MessageHandler {
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        if (!message.matches(".*\\d.*")) {
            messageHandler.handle(message);
        } else {
            throw new RuntimeException("Сообщение не прошло проверку!");
        }
    }
}
