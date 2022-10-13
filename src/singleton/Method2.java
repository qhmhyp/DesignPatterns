package singleton;


//和方法一相同
public class Method2 {
    public static final Method2 INSTANCE;

    static {
        INSTANCE = new Method2();
    }

    //    私有化初始构造器
    private Method2(){};

    public static Method2 getInstance(){
        return INSTANCE;
    }
}
