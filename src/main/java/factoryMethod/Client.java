package factoryMethod;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       BMW bmw1=new FactoryBMW320().createBMW();
       BMW bmw2=new FactoryBMW523().createBMW();
       bmw1.produce();
       bmw2.produce();
    }
}
