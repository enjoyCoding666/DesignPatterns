package proxy.jdkProxy;


public class JdkProxyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        JdkProxyExample jdkProxyExample=new JdkProxyExample();
        UseServiceImpl useService=new UseServiceImpl();
        UseService useServiceProxy=(UseService)jdkProxyExample.getProxyObject(useService);
        useServiceProxy.getName();
    }

}
