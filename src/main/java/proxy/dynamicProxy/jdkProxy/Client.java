package proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *  动态代理的讲解。参考博客： http://blog.csdn.net/goskalrie/article/details/52458773
 */
public class Client {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class<?> clazz=Class.forName("proxy.dynamicProxy.UseService.Car");
//        Car car=(Car)clazz.newInstance();
         Car car=new Car();
        InvocationHandler handler=new TimeHandler(car);
        Class<?> cls=car.getClass();
        Moveable moveable=(Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handler);
        moveable.move();
    }
}
