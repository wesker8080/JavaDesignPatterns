package com.wesker.singleton.dcl;

/**
 * 双检锁/双重校验锁
 *  这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * @author MR.ZHANG
 * @create 2018-12-21 11:22
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){
    }
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
