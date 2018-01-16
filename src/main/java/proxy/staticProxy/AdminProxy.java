package proxy.staticProxy;

/**
 *   以聚合方式实现的真实主题。
 *   真实主题角色，实现抽象主题角色
 */
public class AdminProxy implements Manager {
    private Admin admin;

    public AdminProxy(Admin admin){
//        super();    //这里的suoper调用接口的方法，似乎没什么用
        this.admin=admin;
    }

    @Override
    public void doSomething() {
        System.out.println("admin操作开始");
        admin.doSomething();
        System.out.println("admin操作结束.");
    }
}
