package generative.factory;

public class MultipleBmwFactory implements AbstractBmwFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }

    @Override
    public Bike getBike() {
        return new BmwBike();
    }
}
