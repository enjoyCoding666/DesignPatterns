package factoryabstract;

/**
 * 为宝马523系列生产“配件”
 */
public class Factory523 implements FactoryBMW {
    @Override
    public Engine createEngine() {
        return new Engine523();
    }

    @Override
    public Aircondition createAircondition() {
        return new Aircondition523();
    }
}
