package generative.singleton;

/**
 * Проблема жадного синглтона в том, если инстанс большой, на этапе поднятия приложения,
 * может занять много времени и памяти создать его.
 * <p>
 * Проблема возможно создать два инстанса.
 */
public class SingletonEager {
    private int i;
    public static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {

    }

    public int getI() {
        return i;
    }
}
