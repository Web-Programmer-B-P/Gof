package behavioral.template;

public class Tea extends Beverage {
    @Override
    protected void addBeverage() {
        System.out.println("Add tea");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Add lemon");
    }
}
