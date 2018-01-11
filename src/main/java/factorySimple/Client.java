package factorySimple;

/**
 * 简单工厂模式：由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（这些产品类继承自一个父类或接口）的实例。
 * 利用工厂模式，客户端只需要对工厂指定你要创建的对象的名字（参数），工厂就可以根据你指定的参数动态创建不同的对象
 * 参考博客：http://www.cnblogs.com/kkgreen/archive/2011/08/26/2155171.html
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        BMW bmw1= BMWFactory.createBMW("factorySimple.BMW320");
        BMW bmw2= BMWFactory.createBMW("factorySimple.BMW523");
        produceCar(bmw1);
        produceCar(bmw2);
    }

    public static void produceCar(BMW bmw){
        bmw.produce();
    }
}
