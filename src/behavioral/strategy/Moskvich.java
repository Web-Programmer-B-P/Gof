package behavioral.strategy;

public class Moskvich extends Car {
    public Moskvich(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run moskvich");
    }
}
