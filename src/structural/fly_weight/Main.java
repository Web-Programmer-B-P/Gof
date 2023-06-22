package structural.fly_weight;

/**
 * Паттерн Fly-weight некая реализация кэша.
 */
public class Main {
    public static void main(String[] args) {
        PersonCash cash = new PersonCash();
        PersonWorkInfo worker = cash.getPersonInfo("stree1");
        PersonWorkInfo workInfo = cash.getPersonInfo("stree1");
        System.out.println(worker == workInfo);
        System.out.println(cash.getSize());
    }
}
