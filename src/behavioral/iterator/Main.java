package behavioral.iterator;

import java.util.List;

/**
 * Паттерн итератор(Iterator).
 * <p>
 * Позволяет итерироваться по коллекциям, массивам и т.д.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(List.of("first", "second"));
        Iterator<String> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
