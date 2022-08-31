package basic.enuma;

import basic.enuma.enumMap.Plant;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yy
 * @data 2022/8/14 0:08
 */
public class Test {

    public static void main(String[] args) {
        /**
         *  将运算方法 用枚举来实现，逻辑更清晰,减少出错的可能
         */
        System.out.println(Math.PLUS.apply(1.0, 2.0));

        /**
         *  enumMap
         */
        Plant[] plants = {new Plant("a", Plant.LifeCycle.ANNUAL), new Plant("b", Plant.LifeCycle.BIENNIAL)};

        Map<Plant.LifeCycle, Set<Plant>> plantsLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantsLifeCycle.put(lc, new HashSet<>());
        }
        for (Plant p : plants) {
            plantsLifeCycle.get(p.getLifecycle()).add(p);
        }
        System.out.println(plantsLifeCycle);
    }
}
