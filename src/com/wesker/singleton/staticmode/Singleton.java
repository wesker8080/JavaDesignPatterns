package com.wesker.singleton.staticmode;

/**
 * 目标单例
 * 静态内部类实现方式（推荐）
 * @author MR.ZHANG
 * @create 2018-12-21 9:24
 */
public class Singleton {
    private Singleton(){
        System.out.println("构建这个对象可能耗费很长时间");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static class SingleHolder{
        private static Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return SingleHolder.instance;
    }

}
