package generative.factory;

public class MercedesFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Mercedes();
    }
}
