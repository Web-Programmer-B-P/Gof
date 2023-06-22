package generative.factory;

public abstract class CarFactory {
    public Car createCar() {
        return getCar();
    }

    //Фабричный метод определяет конкретный объект в потомке.
    abstract Car getCar();
}
