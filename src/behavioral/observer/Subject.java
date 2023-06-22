package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
   private final List<MyObservable> list = new ArrayList<>();

    public void subscribe(MyObservable myObservable) {
        this.list.add(myObservable);
    }

    public void unsubscribe(MyObservable myObservable) {
        this.list.remove(myObservable);
    }

    public void notifyAllSubscribers(String message) {
        this.list.forEach(item -> item.consume(message));
    }
}
