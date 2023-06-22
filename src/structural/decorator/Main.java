package structural.decorator;

/**
 * Паттерн декаратор(Decorator).
 * <p>
 * Без этого паттерна придется создавать много своиств ингридиентов и затем проверять на их наличие в коде.
 */
public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        Pizza pepperoniCheesePizza = new PepperoniCheese(cheesePizza);
        Pizza meatPepperoniCheesePizza = new MeatPizza(pepperoniCheesePizza);
        System.out.println(meatPepperoniCheesePizza.makePizza());
    }
}
