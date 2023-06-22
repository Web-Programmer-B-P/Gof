package behavioral.visitor;

public class SoundVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("Wof!");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("May");
    }
}
