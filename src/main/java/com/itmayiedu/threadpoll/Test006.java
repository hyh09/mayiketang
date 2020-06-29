package com.itmayiedu.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/20.
 * @by: DELL)
 */
public class Test006 {


    public static void main(String[] args) {
        // 无限大小线程池 jvm自动回收
        ExecutorService newCachedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            newCachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + ",i:" + temp);

                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                }
            });
        }
    }
}





