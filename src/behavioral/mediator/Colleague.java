package behavioral.mediator;

public abstract class Colleague {
    protected Chat chat;
    protected String name;

    public Colleague(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);

    abstract void printMessage(String message);
}
