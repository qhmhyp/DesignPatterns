package singleton;

public class Method5 {
    public static Method5 INSTANCE;
    private Method5(){}
    public static Method5 getINSTANCE() {
        if (INSTANCE == null){
//            降低锁粒度,还是有多线程问题
            synchronized (Method5.class){
                INSTANCE = new Method5();
            }
        }
        return INSTANCE;
    }
}
