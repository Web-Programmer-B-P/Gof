package behavioral.visitor;

public class EatVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("Eat meat");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("Drink milk");
    }
}
