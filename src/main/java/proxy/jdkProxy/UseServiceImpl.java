package proxy.jdkProxy;

public class UseServiceImpl implements UseService {
    public void getName() {
        System.out.println("调用真实对象的方法getName()");
    }
}
