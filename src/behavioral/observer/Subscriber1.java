package behavioral.observer;

public class Subscriber1 implements MyObservable {
    @Override
    public void consume(String message) {
        System.out.println("Subscriber1 received message " + message);
    }
}
