package com.wesker.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂类 如果享元对象已经存在 那么直接取出来使用就行 否则把该对象存入享元池内
 *
 * @author MR.ZHANG
 * @create 2018-12-27 9:53
 */
public class FlyweightFactory {

    private static ConcurrentHashMap<String, GoFlyweight> map = new ConcurrentHashMap<>(16);

    public static GoFlyweight getGoFlyweight(GoColorEnum goColorEnum) {
        GoFlyweight flyweight = null;
        String color = goColorEnum.getColor();
        if (map.containsKey(color)) {
            flyweight = map.get(color);
        } else {
            flyweight = new GoFlyweight(color);
            map.put(color,flyweight);
        }
        return flyweight;
    }
    public static int getFlyweightPoolSize() {
        return map.size();
    }
}
