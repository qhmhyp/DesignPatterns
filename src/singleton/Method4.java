package singleton;


public class Method4 {
    public static Method4 INSTANCE;

    private Method4() {
    }

//    加锁降低效率
    public synchronized Method4 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Method4();
        }
        return INSTANCE;
    }
}
