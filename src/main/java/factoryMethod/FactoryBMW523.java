package factoryMethod;

public class FactoryBMW523 implements FactoryBMW {
    @Override
    public  BMW createBMW() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (BMW523)Class.forName("factoryMethod.BMW523").newInstance();
    }
}