package factorymethod;

public class FactoryBMW523 implements FactoryBMW {
    @Override
    public  BMW createBMW() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (BMW523)Class.forName("factorymethod.BMW523").newInstance();
    }
}