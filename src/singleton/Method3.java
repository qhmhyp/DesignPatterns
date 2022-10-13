package singleton;

//懒汉式
public class Method3 {
    private static Method3 INSTANCE;

    private Method3(){};

    public static Method3 getInstance(){
//        这里有线程问题
        if (INSTANCE == null) {
            INSTANCE = new Method3();
        }
        return INSTANCE;
    }
}
