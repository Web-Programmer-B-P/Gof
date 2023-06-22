package behavioral.mediator;

/**
 * Паттерн Mediator.
 * <p>
 * Позволяет разослать события по всем объектам, кроме себя.
 */
public class Main {
    public static void main(String[] args) {
        Chat chat = new ChatMediator();
        chat.addColleague(new ColleagueImpl(chat, "Den"));
        chat.addColleague(new ColleagueImpl(chat, "Serg"));
        ColleagueImpl me = new ColleagueImpl(chat, "me");
        chat.addColleague(me);
        me.sendMessage("Hello World!");
    }
}
