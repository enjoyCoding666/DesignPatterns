package composite.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *   组合模式，是指“将对象组合成树形结构以表示‘部分-整体’的层次结构。
 *   组合模式使得用户对单个对象和组合对象的使用具有一致性。”
 *   比如，在总店、分店、加盟店消费，会员卡都会累积积分
 */
public class PayDemo {
    public static void main(String[] args) {
        List<Market> marketList=new ArrayList<>();
        MarketBranch marketRoot=new MarketBranch("总店");
        MarketBranch marketBranch=new MarketBranch("分店");
        marketList.add(marketRoot);
        marketList.add(marketBranch);
        marketRoot.payByCard(marketList);
        marketBranch.payByCard(marketList);
    }
}
