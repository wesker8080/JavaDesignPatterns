package com.wesker.strategy;

/**
 * 策略选择类 用来决定使用哪种策略
 *
 * @author MR.ZHANG
 * @create 2019-03-15 15:41
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int doOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
