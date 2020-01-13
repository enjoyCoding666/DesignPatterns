package factorymethod;

/**
 * 工厂类定义成了接口,而每新增的车种类型,就增加该车种类型对应工厂类的实现,这样工厂的设计就可以扩展了,而不必去修改原来的代码。
 * 为什么此处不用继承,而要使用工厂接口呢？
 */
public interface FactoryBMW {
      BMW  createBMW() throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
