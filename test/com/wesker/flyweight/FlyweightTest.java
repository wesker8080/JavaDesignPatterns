package com.wesker.flyweight;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * 享元模式测试
 *
 * 运用共享技术有效地支持大量细粒度的对象，有效节省内存
 *
 * @author MR.ZHANG
 * @create 2018-12-27 10:10
 */
public class FlyweightTest {

    @Test
    public void test() {
        Stream.iterate(0, x -> x+1).limit(100).forEach(x -> {
            //取出黑棋
            Flyweight goFlyweight = FlyweightFactory.getGoFlyweight(GoColorEnum.BLACK);
            //设置落点
            goFlyweight.setGoLocation(1, 2);
            //取出白棋
            Flyweight goFlyweight1 = FlyweightFactory.getGoFlyweight(GoColorEnum.WHITE);
            //设置落点
            goFlyweight1.setGoLocation(3, 4);
        });
        //验证 此时池内应该只存在两个棋子----白棋和黑棋
        Assert.assertEquals(2, FlyweightFactory.getFlyweightPoolSize());
    }
}
