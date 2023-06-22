package generative.factory;

public class BmwFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Bmw();
    }
}
