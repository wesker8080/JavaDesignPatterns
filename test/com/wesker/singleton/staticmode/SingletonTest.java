package com.wesker.singleton.staticmode;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * 单例模式静态工厂方法测试用例
 */
public class SingletonTest {
   private final AtomicInteger threadNumber = new AtomicInteger(1);;

  @Test
  public void getInstance() {
      Set<Singleton> set = new HashSet<>();
      ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100, 0,
              TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), r -> new Thread("singlePattern : " + threadNumber.getAndIncrement()));
      Stream.iterate(0, x -> x +1)
              .limit(1000)
              .forEach(x -> executor.execute(() -> set.add(Singleton.getInstance())));
      /**
       * Junit 不支持多线程
       * 判断是否所有的线程已经运行完
       */
      while (executor.isTerminated()){
          Assert.assertEquals(1, set.size());
      }
  }
}
