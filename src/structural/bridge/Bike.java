package structural.bridge;

public class Bike extends Vehicle {
    public Bike(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("едем на мото");
    }
}
