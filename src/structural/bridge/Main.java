package structural.bridge;


/**
 * Паттерн мост(Bridge).
 * <p>
 * Проблема у нас есть несколько видов техники
 * interface Car - легковые авто
 * interface Track - грузовые авто
 * <p>
 * Чтобы реализовать нам нужно создать для каждой фирмы свои легковые авто и грузовые авто
 * class AudiCar
 * class AudiTrack
 * <p>
 * class ToyotaCar
 * class ToyotaTrack
 * <p>
 * В случае добавления нового вида транспорта например мотоцикл
 * interface Moto - мотоциклы
 * придется во все фирмы дулировать новый вид транспорта
 * <p>
 * для решения проблемы нужно отделить типы транспорта и конкретные модели.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle trackAudi = new Track(new Audi());
        Vehicle carAudi = new Car(new Audi());
        Vehicle motoAudi = new Bike(new Audi());

        trackAudi.drive();
        carAudi.drive();
        motoAudi.drive();

        Vehicle trackMercedes = new Track(new Mercedes());
        Vehicle carMercedes = new Car(new Mercedes());
        Vehicle motoMercedes = new Bike(new Mercedes());

        trackMercedes.drive();
        carMercedes.drive();
        motoMercedes.drive();
    }
}
