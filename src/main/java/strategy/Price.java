package strategy;

public class Price {
    private  MemberStrategy strategy;

    /**
     *
     * @param strategy  具体的策略对象
     */
    public  Price(MemberStrategy strategy){
        this.strategy=strategy;
    }

    /**
     * 计算折扣后的价格。
     * @param boosPrice
     * @return
     */
    public double quote(double boosPrice){
        return  this.strategy.calcPrice(boosPrice);
    }

}
