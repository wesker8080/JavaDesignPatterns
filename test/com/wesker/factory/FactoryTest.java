package com.wesker.factory;

import org.junit.Test;

/**
 * 工厂方法模式测试
 *
 * @author MR.ZHANG
 * @create 2018-12-21 14:56
 */
public class FactoryTest {
    @Test
    public void test() {
        Factory circleFactory = new CircleFactory();
        circleFactory.createShape().create();
        Factory squareFactory = new SquareFactory();
        squareFactory.createShape().create();
    }
}
