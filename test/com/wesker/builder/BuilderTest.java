package com.wesker.builder;

import org.junit.Test;

/**
 * 建造者模式测试
 *
 * @author MR.ZHANG
 * @create 2018-12-21 12:49
 */
public class BuilderTest {
    @Test
    public void test() {
        NumberBuild number = NumberBuild.Builder.getInstance()
                .buildOne("hello")
                .buildTwo("你好")
                .buildThree("hi")
                .buildFour(6)
                .build();
        System.out.println(number);
    }
}
