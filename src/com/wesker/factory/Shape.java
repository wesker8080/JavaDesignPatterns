package com.wesker.factory;

public interface Shape {

    /**
     * 具体什么形状，由子类去draw
     *
     */
    void create();
}
