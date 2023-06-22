package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Паттерн Memento.
 * <p>
 * Позволяет откатится к предыдущему состоянию сущности.
 */
public class Main {
    public static void main(String[] args) {
        List<Originator.Memento> list = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("one");
        list.add(originator.saveState());
        originator.setState("two");
        list.add(originator.saveState());
        originator.setState("three");
        System.out.println(originator.getState());
        originator.restoreFromMemento(list.get(0));
        System.out.println(originator.getState());
        originator.restoreFromMemento(list.get(1));
        System.out.println(originator.getState());
    }
}
