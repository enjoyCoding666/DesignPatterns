package strategy.demo2;

/**
 * 策略模式。针对不同等级的客户，采用不同的算法
 * 策略模式，可以避免大量的if和else.
 * 参考博客：http://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html
 */
public class Client {
    public static void main(String[] args) {
        MemberStrategy strategy=new AdvancedMemberStrategy();
        Price price=new Price(strategy);
        double quote=price.quote(300);
        System.out.println("该会员购买的图书经过计算价格为："+quote);

    }
}
