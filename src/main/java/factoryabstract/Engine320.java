package factoryabstract;

/**
 * 产品类由多种配件类组成
 * BMW320由Engine320、Aircondition320等配件组成
 */
public class Engine320 implements Engine {
    public Engine320(){
        System.out.println("制造BMW320发动机");
    }
}
