package com.wesker.flyweight;

/**
 * 享元抽象类，定义了外部状态
 * 外部状态是不定的，随环境改变而改变的
 *
 * @author MR.ZHANG
 * @create 2018-12-26 17:28
 */
public interface Flyweight {

    /**
     * 设置落点坐标
     * @param x 落点X坐标值
     * @param y 落点Y坐标值
     */
    public abstract void setGoLocation(int x, int y);

    /**
     * 获取落点坐标
     */
    public abstract String getGoLocation();
}
