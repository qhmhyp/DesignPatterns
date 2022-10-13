package singleton;

//解决线程问题，无构造方法所以防止反序列化（防止反射）
public enum Method8 {
    INSTANCE;
}
