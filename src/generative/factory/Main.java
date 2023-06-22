package generative.factory;

/**
 * Паттерн фабричный метод(Method Factory) и абстрактная фабрика(Abstract Factory).
 * <p>
 * Фабричный метод содержит абстрактный метод который возращает объект, определяемый через потомка.
 * <p>
 * Абстрактная фабрика может создавать группу фабричных методов.
 */
public class Main {
    public static void main(String[] args) {

        //Фабричный метод
        CarFactory mercedesFactory = new MercedesFactory();
        Car mercedes = mercedesFactory.createCar();
        mercedes.drive();

        CarFactory bmwFactory = new BmwFactory();
        Car bmw = bmwFactory.createCar();
        bmw.drive();

        //Абстрактная фабрика
        AbstractBmwFactory multipleBmwFactory = new MultipleBmwFactory();
        Car carBmw = multipleBmwFactory.getCar();
        Bike bikeBmw = multipleBmwFactory.getBike();
        carBmw.drive();
        bikeBmw.drive();
    }
}
