package behavioral.state;

/**
 * Паттерн состояние(State).
 * <p>
 * Позволяет переходить из одного состояния в другое.
 */
public class Main {
    public static void main(String[] args) {
        GumMachine gumMachine = new GumMachine();
        gumMachine.insertQuarter();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
    }
}
