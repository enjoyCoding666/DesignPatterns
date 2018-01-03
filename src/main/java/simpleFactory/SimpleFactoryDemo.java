package simpleFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        BMW bmw1=CarFactory.createBMW("simpleFactory.BMW320");
        BMW bmw2=CarFactory.createBMW("simpleFactory.BMW523");
        driveCar(bmw1);
        driveCar(bmw2);
    }

    public static void driveCar(BMW bmw){
        bmw.drive();
    }
}
