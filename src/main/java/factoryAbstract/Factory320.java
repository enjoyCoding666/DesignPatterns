package factoryAbstract;


/**
 * 为宝马320系列生产“配件”
 */
public class Factory320 implements FactoryBMW {
    @Override
    public Engine createEngine() {
        return new Engine320();
    }

    @Override
    public Aircondition createAircondition() {
        return new Aircondition320();
    }
}
