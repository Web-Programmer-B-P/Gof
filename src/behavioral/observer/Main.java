package behavioral.observer;

/**
 * Паттерн Observer.
 * <p>
 * Позволяет разослать события всем подписчикам.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        subject.subscribe(sub1);
        subject.subscribe(sub2);
        subject.notifyAllSubscribers("Hello my Dear Subscribers!");
        subject.unsubscribe(sub1);
        subject.notifyAllSubscribers("Ping subscribers!");
    }
}
