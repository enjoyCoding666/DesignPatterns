package simpleFactory;

/**
 * 简单工厂类。可以生产不同类型的单一产品。
 */
public class CarFactory {
    /**
     *  通过反射机制实例化
     * @param carName   包名.类名组成的class。
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static BMW createBMW(String carName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (BMW)Class.forName(carName).newInstance();
    }
}
