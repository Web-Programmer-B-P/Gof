package behavioral.visitor;

/**
 * Паттерн Visitor.
 */
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.accept(new SoundVisitor());
        cat.accept(new EatVisitor());
        System.out.println();
        Animal dog = new Dog();
        dog.accept(new SoundVisitor());
        dog.accept(new EatVisitor());
    }
}
