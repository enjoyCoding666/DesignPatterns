package strategy;

/**
 * 抽象折扣类
 */
public interface MemberStrategy {
    public double calcPrice(double booksPrice);
}
