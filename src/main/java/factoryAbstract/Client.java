package factoryAbstract;

/**
 * 在客戶端中，根据不同的工厂，制造不同型号的配件。
 */
public class Client {
    public static void main(String[] args) {
        FactoryBMW factory1=new Factory320();
        FactoryBMW factory2=new Factory523();
        factory1.createAircondition();
        factory1.createEngine();
        factory2.createAircondition();
        factory2.createEngine();
    }
}
