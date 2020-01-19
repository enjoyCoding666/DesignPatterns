package strategy.demo2;

public class Price {
    private  MemberStrategy strategy;

    /**
     * 在构造方法中，注入策略对象
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
