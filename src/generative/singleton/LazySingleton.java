package generative.singleton;

//import java.io.Serializable;
//
///**
// * Решаем проблему жадного синглетона.
// * Пока мы не обратимся к методу, инстанс создан не будет.
// * <p>
// * Проблема возможно создать два инстанса.
// */
//public class LazySingleton implements Serializable {
//    private int i;
////    private volatile static LazySingleton INSTANCE;
//
//    private LazySingleton() {
//
//    }
//
//    public int getI() {
//        return i;
//    }
//
//    /**
//     * Двойная проверка с синхронизацией, решает проблему с многопоточкой.
//     * @return
//     */
////    public static LazySingleton getInstance() {
////        if (INSTANCE == null) {
////            synchronized (LazySingleton.class) {
////                if (INSTANCE == null) {
////                    INSTANCE = new LazySingleton();
////                }
////            }
////        }
////        return INSTANCE;
////    }
//
//}
