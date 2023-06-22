package structural.bridge;

public class Track extends Vehicle {
    public Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Едем на грузовике");
    }
}
