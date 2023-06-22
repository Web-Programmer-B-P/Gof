package behavioral.chain;

public abstract class MessageHandler {
    protected MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String message);
}
