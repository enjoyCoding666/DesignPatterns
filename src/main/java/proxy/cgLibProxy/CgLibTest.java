package proxy.cgLibProxy;

public class CgLibTest {
    public static void main(String[] args) {
          CgLibProxyExample cgLibProxyExample=new CgLibProxyExample();
          Order order=(Order) cgLibProxyExample.getProxy(Order.class);
          order.getOrder();
    }
}
