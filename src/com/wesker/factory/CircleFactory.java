package com.wesker.factory;

/**
 * @author MR.ZHANG
 * @create 2018-12-21 14:54
 */
public class CircleFactory implements Factory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
