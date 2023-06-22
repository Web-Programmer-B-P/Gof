package structural.bridge;

public abstract class Vehicle {
   protected Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}
