package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
    private  Object target=null;

    /**
     * 建立代理对象和真实对象的代理关系，并返回代理对象
     * @param target 真实对象
     * @return 代理对象
     */
    public Object getProxyObject(Object target) {
        this.target=target;
        //以下三个参数分别表示类加载器 、Class的全部接口、当前对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     *  代理方法
     * @param proxy  代理对象
     * @param method 当前调度方法
     * @param args  当前方法参数
     * @return  代理结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法。");
        System.out.println("在调度真实对象之前的逻辑");
        Object object=method.invoke(target,args);       //通过反射进行方法的调用
        System.out.println("在调度真实对象之后的逻辑");
        return object;
    }
}
