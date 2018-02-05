package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * jdk观察者接口测试类
 * addObserver()、deleteObserver()、notifyObservers()三个方法分别表示添加、删除、通知观察者对象功能。
 */
public class ObserverTest {
    public static void main(String[] args) {
          JSubject subject=new JSubject();
          Observer observer=new OneObserver();
          subject.addObserver(observer);
          subject.setData("data");
    }
}
