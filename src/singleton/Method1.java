package singleton;
//饿汉式，无线程问题
public class Method1 {
    public static final Method1 INSTANCE = new Method1();

//    私有化初始构造器
    private Method1(){};

    public static Method1 getInstance(){
        return INSTANCE;
    }

}
