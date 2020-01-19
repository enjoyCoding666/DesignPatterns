package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:27
 * @Description:
 *
 *  参考资料：https://www.cnblogs.com/ldsweely/p/12058346.html
 */
public class Client {

    public static double getResult(long money, String type) {
        MemberStrategy strategy = StrategyFactory.getInstance().getMemberStrategy(type);

        if (strategy == null){
            throw new IllegalArgumentException("please input right type");
        }

        return strategy.compute(money);
    }
}
