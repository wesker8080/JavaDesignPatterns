package com.wesker.factory;

/**
 * @author MR.ZHANG
 * @create 2018-12-21 14:55
 */
public class SquareFactory implements Factory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
