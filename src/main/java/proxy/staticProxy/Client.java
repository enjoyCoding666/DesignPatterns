package proxy.staticProxy;

/**
 * 通过代理类，调用相关的方法
 * 代理类似于"中介"卖房子
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("聚合式静态代理:");
        Admin admin=new Admin();
        Manager manager=new AdminProxy(admin);
        manager.doSomething();

        System.out.println("\n继承式静态代理:");
        Manager proxy=new AdminProxy2();
        proxy.doSomething();
    }
}
