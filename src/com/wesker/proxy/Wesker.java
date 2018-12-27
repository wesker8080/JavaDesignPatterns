package com.wesker.proxy;

/**
 * 具体对象
 *
 * @author MR.ZHANG
 * @create 2018-12-21 11:35
 */
public class Wesker implements Person{
    @Override
    public String doSing(String name) {
        return "wesker doSing done";
    }

    @Override
    public String doDance(String name) {
        return "wesker doDance done";
    }
}
