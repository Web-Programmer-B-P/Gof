package behavioral.strategy;

public class Bmw extends Car {
    public Bmw(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run bmw");
    }
}
