package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:07
 * @Description:
 */
public class PlatinumStrategy implements MemberStrategy {

    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }

    @Override
    public String getType() {
        return UserTypeEnum.PLATINUM_VIP.getType();
    }
}
