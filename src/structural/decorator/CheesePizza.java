package structural.decorator;

public class CheesePizza implements Pizza {
    private final Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese";
    }
}
