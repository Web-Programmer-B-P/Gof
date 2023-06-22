package structural.decorator;

public class MeatPizza implements Pizza {
    private final Pizza pizza;

    public MeatPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " meat";
    }
}
