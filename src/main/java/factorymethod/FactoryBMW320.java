package factorymethod;

public class FactoryBMW320 implements FactoryBMW {
    /**
     * 这里的反射用得不太好，不够灵活
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Override
    public  BMW createBMW() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (BMW320)Class.forName("factorymethod.BMW320").newInstance();
    }
}
