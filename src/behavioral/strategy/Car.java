package behavioral.strategy;

public abstract class Car {
    private Flyable flyable;

    public Car(Flyable flyable) {
        this.flyable = flyable;
    }

    abstract void run();

    public void stop() {
        System.out.println("stop");
    }

    public void fly() {
        flyable.fly();
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
