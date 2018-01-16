package proxy.staticProxy;

/**
 *  真实主题类
 */
public class Admin implements  Manager{
    @Override
    public void doSomething() {
        System.out.println("Admin do something.");
    }

}
