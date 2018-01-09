package singleton;

/**
 * 饿汉式。在类中实例化，外部调用时直接返回单例。
 */
public class Singleton{
    private static Singleton singleton=new Singleton();
    //构造器私有化
    private Singleton(){

    }

    public static  Singleton  getInstance(){
        return singleton;
    }
}
