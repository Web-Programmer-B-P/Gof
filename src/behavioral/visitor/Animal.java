package behavioral.visitor;

public interface Animal {
    void accept(AnimalVisitor animalVisitor);
}
