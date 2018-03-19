package responsibilityChain;

/**
 * 责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1=new ConcreteHandler();
        Handler handler2=new ConcreteHandler();
        handler1.setNextHandler(handler2);
        handler1.handleRequest();

    }
}
