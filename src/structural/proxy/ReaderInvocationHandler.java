package structural.proxy;

import structural.proxy.ReaderImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReaderInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(args[0]);
        Object result = method.invoke(new ReaderImpl(), args);
        System.out.println(result);
        return result;
    }
}
