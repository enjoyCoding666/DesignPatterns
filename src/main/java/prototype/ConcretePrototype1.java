package prototype;

/**
 * 具体原型角色
 */
public class ConcretePrototype1 implements  Prototype{
    /**
     * 最简单的克隆，新建一个自身对象，由于没有属性就不再复制值
     * @return
     */
    @Override
    public Prototype clone() {
        Prototype prototype=new ConcretePrototype1();
        return prototype;
    }
}
