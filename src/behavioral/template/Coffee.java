package behavioral.template;

public class Coffee extends Beverage {
    @Override
    protected void addBeverage() {
        System.out.println("Add coffee");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Add milk");
    }

    @Override
    protected void hook() {
        System.out.println("Add cream");
    }
}
