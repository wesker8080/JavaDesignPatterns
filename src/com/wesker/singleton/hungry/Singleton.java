package com.wesker.singleton.hungry;

/**
 * 饿汉模式 容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * @author MR.ZHANG
 * @create 2018-12-21 10:58
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){
     System.out.println("构建这个对象可能需要很多时间");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
