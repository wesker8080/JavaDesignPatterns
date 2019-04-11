package com.wesker.adapter;

import org.junit.Test;

/**
 * 适配器模式 这个示例是解决接口方法比较多，里面又有我们不需要用到的方法
 * 通过抽象类预先实现全部接口，然后具体实现类继承抽象类，按需重写需要用到的方法即可
 * 具体实现查看SimpleInBoundHandler.java
 *
 * @author MR.ZHANG
 * @create 2019-04-11 16:12
 */
public class AdapterTest {
    @Test
    public void test() {
        SimpleInBoundHandler handler = new SimpleInBoundHandler();
    }
}
