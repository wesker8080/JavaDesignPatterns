package com.wesker.flyweight;

/**
 * 享元实体类 定义了内部状态
 * 内部状态是固定的 不可改变的
 * @author MR.ZHANG
 * @create 2018-12-27 9:26
 */
public class GoFlyweight implements Flyweight{

    /**
     * 围棋大小
     */
    protected final int goSize = 10;
    /**
     * 围棋颜色
     */
    private final String color;

    private GoLocation goLocation = new GoLocation();

    public GoFlyweight(String color) {
        this.color = color;
    }

    @Override
    public void setGoLocation(int x, int y) {
        goLocation.setGoLocation(x, y);
    }

    @Override
    public String getGoLocation() {
        return goLocation.getLocation();
    }
    public int getGoSize() {
        return this.goSize;
    }
}
