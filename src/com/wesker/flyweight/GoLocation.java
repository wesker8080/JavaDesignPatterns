package com.wesker.flyweight;

/**
 * 围棋落点位置
 *
 * @author MR.ZHANG
 * @create 2018-12-26 17:53
 */
public class GoLocation {
    /**
     * 落点X坐标值
     */
    private int x;
    /**
     * 落点Y坐标值
     */
    private int y;

    /**
     * 落点坐标
     * @param x 落点X坐标值
     * @param y 落点Y坐标值
     */
    public void setGoLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getLocation() {
        return x + "_" + y;
    }
}
