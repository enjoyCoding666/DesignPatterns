package factoryMethod;

/**
 * 具体产品
 */
public class BMW320 extends BMW {
    @Override
    public void produce() {
        System.out.println("生产BMW320");
    }
}
