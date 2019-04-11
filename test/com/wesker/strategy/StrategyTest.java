package com.wesker.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 策略模式 行为型模式
 * 主要解决：在有多种算法相似的情况下 使用 if...else 所带来的复杂和难以维护
 *
 * @author MR.ZHANG
 * @create 2019-03-15 15:46
 */
public class StrategyTest {
    @Test
    public void test() {
        Context contextOfAdd = new Context(new OperationAdd());
        int resultOfAdd = contextOfAdd.doOperation(5, 5);
        Assert.assertEquals(10, resultOfAdd);
        Context contextOfSubtract = new Context(new OperationSubtract());
        int resultOfSubtract = contextOfSubtract.doOperation(5, 5);
        Assert.assertEquals(0, resultOfSubtract);
        Context contextOfMultiply = new Context(new OperationMultiply());
        int resultOfMultiply = contextOfMultiply.doOperation(5, 5);
        Assert.assertEquals(25, resultOfMultiply);
    }
}
