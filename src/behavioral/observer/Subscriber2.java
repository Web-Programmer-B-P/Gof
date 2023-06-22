package behavioral.observer;

public class Subscriber2 implements MyObservable {
    @Override
    public void consume(String message) {
        System.out.println("Subscriber2 received message " + message);
    }
}
