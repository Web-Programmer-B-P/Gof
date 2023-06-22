package structural.decorator;

public class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return "Pizza with ";
    }
}
