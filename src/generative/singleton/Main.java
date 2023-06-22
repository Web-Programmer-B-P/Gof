package generative.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Паттерн одиночка(Singleton).
 * <p>
 * Позволяет иметь один инстанс на приложение.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException {
//        SingletonEager singletonEager = SingletonEager.INSTANCE;
//        System.out.println(singletonEager.getI());

//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazySingleton lazySingleton1 = LazySingleton.getInstance();
//        System.out.println(lazySingleton.getI());

//        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
//        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
//        System.out.println(enumSingleton1 == enumSingleton2);

        // В многопоточном режиме так же возможно получить второй инстанс синглтона,
        // решаем проблему двойной проверкой инстанса в момент инициализации.
//        SingletonWrapper singletonWrapper1 = new SingletonWrapper();
//        SingletonWrapper singletonWrapper2 = new SingletonWrapper();
//        Thread thread1 = new Thread(() -> {
//            singletonWrapper1.lazySingleton = LazySingleton.getInstance();
//            singletonWrapper1.enumSingleton = EnumSingleton.INSTANCE;
//        });
//
//        Thread thread2 = new Thread(() -> {
//            singletonWrapper2.lazySingleton = LazySingleton.getInstance();
//            singletonWrapper2.enumSingleton = EnumSingleton.INSTANCE;
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//
//        System.out.println(singletonWrapper1.lazySingleton == singletonWrapper2.lazySingleton);
//        System.out.println(singletonWrapper1.enumSingleton == singletonWrapper2.enumSingleton);


        // Демонстрация возможности получения второго инстанса синглтона.
        // На Enum сингтоне это не распространяется.
//        try (FileOutputStream fileOutputStream = new FileOutputStream("test.doc");
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//             FileInputStream fileInputStream = new FileInputStream("test.doc");
//             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

//            objectOutputStream.writeObject(lazySingleton);
//            lazySingleton = (LazySingleton) objectInputStream.readObject();
//            System.out.println(lazySingleton == lazySingleton1);

//            objectOutputStream.writeObject(enumSingleton1);
//            enumSingleton1 = (EnumSingleton) objectInputStream.readObject();
//            System.out.println(enumSingleton1 == enumSingleton2);
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        // Можем получить новый инстансе через рефлексию.
//        Constructor<LazySingleton> constructor =
//                (Constructor<LazySingleton>) LazySingleton.class.getDeclaredConstructors()[0];
//        constructor.setAccessible(true);
//        LazySingleton lazySingleton1 = constructor.newInstance();
//        LazySingleton lazySingleton2 = LazySingleton.getInstance();
//        System.out.println(lazySingleton1 == lazySingleton2);


        // К Enum мы даже не сможем достучаться через рефлексию, будет исключение Cannot reflectively create enum objects.
//        Constructor<EnumSingleton> enumConstructor =
//                (Constructor<EnumSingleton>)EnumSingleton.class.getDeclaredConstructors()[0];
//        enumConstructor.setAccessible(true);
//        EnumSingleton enumSingleton1 = enumConstructor.newInstance();
//        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
//        System.out.println(enumSingleton1 == enumSingleton2);

        // Получаем второй инстанс через ClassLoader
        // С Enum токой подход не сработает инстанс будет один.
//        ClassLoader classLoader = LazySingleton.class.getClassLoader();
//        Class<?> loadClass = classLoader.loadClass("singleton.LazySingleton");
//        Constructor<LazySingleton> constructor =
//                (Constructor<LazySingleton>) loadClass.getDeclaredConstructors()[0];
//        constructor.setAccessible(true);
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazySingleton lazySingleton1 = constructor.newInstance();
//        System.out.println(lazySingleton == lazySingleton1);
    }
}
