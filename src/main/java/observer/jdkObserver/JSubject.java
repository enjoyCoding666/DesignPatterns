package observer.jdkObserver;

import java.util.Observable;

/**
 * 编制主题类JSubject，实现Observable接口。
 */
public class JSubject extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        //改变主题状态4qs
        setChanged();
        //通知所有的观察者
        notifyObservers(null);
    }
}
