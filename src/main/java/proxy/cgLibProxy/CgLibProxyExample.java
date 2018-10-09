package proxy.cgLibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibProxyExample implements MethodInterceptor {
    /**
     * 生成cgLib代理对象
     * @param cls
     * @return
     */
   public  Object getProxy(Class cls) {
       Enhancer enhancer=new Enhancer();
       //设置增强类型
       enhancer.setSuperclass(cls);
       //定义代理逻辑对象为当前对象。要求当前对象实现MethodInterceptor接口。
       enhancer.setCallback(this);
       //生成并返回代理对象
       return  enhancer.create();
   }

    /**
     * 代理逻辑方法。
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前。");
        Object result=methodProxy.invokeSuper(o,args);
        System.out.println("调用真实对象后。");
        return result;
    }
}
