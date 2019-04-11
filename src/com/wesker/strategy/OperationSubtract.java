package com.wesker.strategy;

/**
 * @author MR.ZHANG
 * @create 2019-03-15 15:36
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
