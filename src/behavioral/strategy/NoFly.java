package behavioral.strategy;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
