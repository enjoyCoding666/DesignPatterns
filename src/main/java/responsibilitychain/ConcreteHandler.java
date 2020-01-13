package responsibilitychain;

public class ConcreteHandler extends Handler {
    /**
     * 判断是否有后继的责任对象
     * 如果有，就转发请求给后继的责任对象
     * 如果没有，则处理请求
     */

    @Override
    public void handleRequest() {
       if(getNextHandler()!=null)  {
           System.out.println("继续往下请求");
           getNextHandler().handleRequest();
       }else {
           System.out.println("处理请求");
       }
    }
}
