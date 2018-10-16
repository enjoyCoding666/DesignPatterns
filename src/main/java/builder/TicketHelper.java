package builder;


/**
 * 这是一个配置类。帮助一步步构建复杂的对象。
 */
public class TicketHelper {
    public void buildAdult(String info){
        System.out.println("构建成年人票逻辑："+info);
    }

    public void buildChildrenForSeat(String info){
        System.out.println("构建有座儿童票逻辑："+info);
    }

    public void buildChildrenNoSeat(String info){
        System.out.println("构建无座儿童票逻辑："+info);
    }

}
