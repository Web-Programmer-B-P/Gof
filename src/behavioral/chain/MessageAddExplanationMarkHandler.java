package behavioral.chain;

public class MessageAddExplanationMarkHandler extends MessageHandler {
    public MessageAddExplanationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(String message) {
        messageHandler.handle(message + "!");
    }
}
