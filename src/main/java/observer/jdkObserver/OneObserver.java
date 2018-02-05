package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者类
 */
public class OneObserver implements Observer  {
    @Override
    public void update(Observable o, Object arg) {
        JSubject subject=(JSubject)o;
        System.out.println("The data is :"+subject.getData());
    }
}
