package structural.facade;

/**
 * Паттерн фасад(Facade).
 * <p>
 * Объединяет в себе вызов сложной логики в одном методе.
 */
public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButton("22", "5");
        System.out.println();
        BadRoom badRoom = new BadRoom();
        badRoom.pressButton("16", "124");
    }
}
