package observer;

public class Observer implements IObserver {
    private  String name;
    public Observer(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void refresh(String data) {
        System.out.println(getName()+"接收到数据:"+data);
    }
}
