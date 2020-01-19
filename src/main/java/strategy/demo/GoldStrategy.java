package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:06
 * @Description:
 */
public class GoldStrategy implements MemberStrategy{

    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public String getType() {
        return UserTypeEnum.GOLD_VIP.getType();
    }
}