package behavioral.mediator;

public class ColleagueImpl extends Colleague {
    public ColleagueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " " +message);
    }
}
