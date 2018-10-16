package builder;


/**
 * 构建模式的使用。构建分为若干步，通过一步步构建信息，把一个复杂的对象构建出来。
 */
public class BuilerDemo {
    public static void main(String[] args) {
        TicketHelper ticketHelper=new TicketHelper();
        ticketHelper.buildAdult("成人票");
        ticketHelper.buildChildrenForSeat("有座儿童");
        ticketHelper.buildChildrenNoSeat("无座儿童");
        TicketBuilder ticketBuilder=new TicketBuilder();
        Object ticket= ticketBuilder.builder(ticketHelper);
    }
}
