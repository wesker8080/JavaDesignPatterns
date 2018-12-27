package com.wesker.singleton.lazy;

/**
 * 懒汉
 * 有线程安全与不安全两种实现
 * 线程不安全：在多线程不能正常工作
 * 线程安全：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步
 *  优点：第一次调用才初始化，避免内存浪费。
 *  缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @author MR.ZHANG
 * @create 2018-12-21 11:17
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    /**
     * 线程不安全
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /**
     * 线程安全
     *
     * @return
     */
    public static synchronized Singleton getInstanceSafe() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
