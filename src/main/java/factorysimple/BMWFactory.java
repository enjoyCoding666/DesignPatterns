package factorysimple;


public class BMWFactory {
    /**
     *  通过反射机制实例化。
     *  利用工厂模式，客户端只需要对工厂指定你要创建的对象的名字（参数），工厂就可以根据你指定的参数动态创建不同的对象
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
