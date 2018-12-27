package com.wesker.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * @author MR.ZHANG
 * @create 2018-12-21 11:48
 */
public class ProxyTest {
    private Person person;
    @Before
    public void init() {
        person = new Wesker();
    }
    @Test
    public void test() {
        WeskerInvocationHandler handler = new WeskerInvocationHandler(person);
        Person wesker = (Person) Proxy.newProxyInstance(WeskerInvocationHandler.class.getClassLoader(), new Class[]{Person.class}, handler);
        String result = wesker.doSing("happy new year");
        Assert.assertEquals("wesker doSing done", result);
    }
}
