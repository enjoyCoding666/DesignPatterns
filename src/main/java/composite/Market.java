package composite;

import java.util.List;

/**
 * 店铺接口
 */
public abstract class Market {
    private String name;
    public abstract void add(Market m ,List<Market> marketList);
    public abstract void remove(Market m ,List<Market> marketList);
    public abstract void payByCard(List<Market> marketList);
    public abstract String getName();
    public abstract void setName(String name);
}
