package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    /**
     * 观察者列表
     */
    private List<IObserver> list=new ArrayList<>();
    /**
     * 主体中心数据
     */
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * 添加观察者
     * @param observer
     */
    @Override
    public void register(IObserver observer) {
        list.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    @Override
    public void unregister(IObserver observer) {
        if(list.contains(observer)) {
             list.remove(observer);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers() {
        for(IObserver observer : list) {
            observer.refresh(data);
        }
    }
}
