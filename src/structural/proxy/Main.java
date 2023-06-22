package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Паттерн Proxy.
 * <p>
 * Позволяет обернуть оригинальный объект и выполнить над ним какие то манипуляции, до и после вызова.
 */
public class Main {
    public static void main(String[] args) {
        //Самописная реализация proxy
//        Reader reader = new ProxyReader();
//        reader.read("New");

        //Существующая реализация proxy в java
        InvocationHandler invocationHandler = new ReaderInvocationHandler();
        Object proxy = Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{Reader.class}, invocationHandler);
        ((Reader) proxy).read("Hello");
    }
}
