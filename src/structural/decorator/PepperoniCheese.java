package structural.decorator;

public class PepperoniCheese implements Pizza {
    private final Pizza pizza;

    public PepperoniCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " pepperoni";
    }
}
