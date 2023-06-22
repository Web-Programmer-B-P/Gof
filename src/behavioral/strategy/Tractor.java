package behavioral.strategy;

public class Tractor extends Car {
    public Tractor(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run tractor");
    }
}
