package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:01
 * @Description:
 */
public interface MemberStrategy {
    // 计费方法
    double compute(long money);

    String getType();
}
