package singleton;

/**
 * 饿汉式。在类中实例化，外部调用时直接返回单例。
 */
public class Singleton1 {
    private static Singleton1 singleton1=new Singleton1();
    //构造器私有化
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return singleton1;
    }
}
