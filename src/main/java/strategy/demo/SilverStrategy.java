package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:04
 * @Description:
 */
public class SilverStrategy implements MemberStrategy {

    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public String getType() {
        return UserTypeEnum.SILVER_VIP.getType();
    }
}