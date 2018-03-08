package composite.example2;

import java.util.List;

/**
 * 总店。分店。加盟店。
 */
public class MarketBranch extends Market{
    private String name;
    public MarketBranch(String name) {
        this.name=name;
    }

    @Override
    public void add(Market m,List<Market> marketList) {

    }

    @Override
    public void remove(Market m, List<Market> marketList) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void payByCard(List<Market> marketList) {
        System.out.println(name+"消费");
        for(Market market:marketList){
            System.out.println(market.getName()+"积分已累加");
        }
    }
}
