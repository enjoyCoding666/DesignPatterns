package composite.example1;

import java.util.List;

/**
 * 抽象构件角色类
 */
public  abstract class Component {
    /**
     * 输出组件的结构
     * @param preStr
     */
    public  abstract  void printStruct(String preStr);

    /**
     * 添加子组件对象
     * @param child
     */
    public void addChild(Component child){
        //如果组件没有子组件就抛异常。树枝有子组件，而叶子没有子组件
        throw  new UnsupportedOperationException("对象不支持此功能");
    }

    /**
     * 移除子组件对象
     * @param index
     */
    public void removeChild(int index){
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    /**
     * 获取子组件对象
     * @return
     */
    public List<Component> getChild(){
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
