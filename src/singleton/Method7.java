package singleton;

//静态内部类实现懒汉，解决多线程问题；
public class Method7 {
    private Method7() {
    }

    private static class InstanceHolder {
        private static final Method7 INSTANCE = new Method7();
    }

    public static Method7 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
