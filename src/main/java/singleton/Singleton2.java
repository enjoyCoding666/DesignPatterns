package singleton;

/**
 * 懒汉式。在类中仅仅只是声明，外部需要调用单例时才实例化。
 */
public class Singleton2{
    private  static  Singleton2  singleton;
    //构造器私有化
    private Singleton2(){

    }
    //注意，记得加同步锁，保证线程安全
    public  static synchronized  Singleton2 getInstance(){
        if(singleton==null) {
            singleton=new Singleton2();
        }
        return singleton;
    }

}
