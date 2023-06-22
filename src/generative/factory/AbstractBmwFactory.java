package generative.factory;

/**
 * Объеденяет в себе несколько типов объектов, которые будут определены в потомках.
 */
public interface AbstractBmwFactory {
    Car getCar();

    Bike getBike();
}
