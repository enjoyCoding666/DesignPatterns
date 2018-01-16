package proxy.staticProxy;

/**
 * 继承式静态代理。
 * 真实主题角色，实现抽象主题角色。
 */
public class AdminProxy2 extends  Admin{
    @Override
    public void doSomething(){
        System.out.println("admin操作开始");
        super.doSomething();           //调用父类的方法
        System.out.println("admin操作结束");
    }
}
