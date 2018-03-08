package composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件角色类
 */
public class Composite extends Component {
    /**
     * 组合对象的名字
     */
    private String name;
    /**
     * 用来存储子对象的集合
     */
    private List<Component> childComponents = new ArrayList<Component>();

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);
        if (this.childComponents != null) {
            preStr += "  ";
            for (Component c : childComponents) {
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }

    /**
     * 构造方法，传入组合对象的名字
     * @param name
     */
    public Composite(String name){
        this.name=name;
    }

    public void addChild(Component child) {
        childComponents.add(child);
    }

    public  void removeChild(Component child){
        childComponents.remove(child);
    }

    /**
     * 聚集管理方法，返回所有子构件对象
     */
    public List<Component> getChild(){
        return childComponents;
    }


}
