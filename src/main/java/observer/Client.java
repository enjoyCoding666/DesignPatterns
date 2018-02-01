package observer;

/**
 * 参考博客：http://blog.csdn.net/goskalrie/article/details/52440618
 */
public class Client {
    public static final String DATA="data";
    public static void main(String[] args) {
        Observer observer1=new Observer("observer1");
        Observer observer2=new Observer("observer2");
        Subject subject=new Subject();
        subject.register(observer1);
        subject.register(observer2);
        subject.setData(DATA);
        subject.notifyObservers();
    }
}
