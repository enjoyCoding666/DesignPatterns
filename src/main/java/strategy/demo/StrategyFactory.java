package strategy.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:23
 * @Description:
 */
public class StrategyFactory {

    private Map<String, MemberStrategy> map;

    public StrategyFactory() {

        List<MemberStrategy> strategies = new ArrayList<>();

        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());
        strategies.add(new PlatinumStrategy());

        // 重点
        map = strategies.stream().collect(Collectors.toMap(MemberStrategy::getType, strategy -> strategy));

        /* 等同上面
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }*/
    }

    private static class Holder {
        private static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public MemberStrategy getMemberStrategy(String type) {
        return map.get(type);
    }
}
