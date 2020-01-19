package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:02
 * @Description:
 */
public class OrdinaryStrategy implements MemberStrategy {

    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }

    @Override
    public String getType() {
        return UserTypeEnum.ORDINARY.getType();
    }
}
