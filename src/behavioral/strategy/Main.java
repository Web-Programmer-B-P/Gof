package behavioral.strategy;

/**
 * Паттерн стратегия(Strategy).
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Bmw(new FlyCar());
        Car tractor = new Tractor(new NoFly());
        bmw.run();
        bmw.fly();
        tractor.run();
        tractor.fly();
    }
}
