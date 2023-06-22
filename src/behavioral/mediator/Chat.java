package behavioral.mediator;

public interface Chat {
    void sendMessage(String msg, Colleague colleague);

    void addColleague(Colleague colleague);
}
