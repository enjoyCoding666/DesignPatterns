package singleton;

public class Singleton{
    /**
     * 懒汉式。先声明，等要用的时候再实例化。
     * 使用volatile修饰，保证可见性。
     */
    private  static volatile Singleton singleton=null;

    private Singleton(){
        //..
    }

    /**
     * 使用双重检查锁,保证线程安全。
     * static修饰为静态变量，可以直接通过类名调用。
     */
    public static Singleton getSingleton() {
        if(singleton==null) {
            synchronized(singleton) {
                if(singleton==null) {
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

}
