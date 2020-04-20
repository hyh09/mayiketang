package com.itmayiedu.produce;

import javax.xml.crypto.Data;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/20.
 * @by: DELL)
 */
public class ProducerThread implements  Runnable {

    private BlockingQueue<String> blockingQueue;
    private AtomicInteger count = new AtomicInteger();
    private volatile boolean FLAG = true;

    public ProducerThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        System.out.println("###################"+Thread.currentThread().getName() + "生产者开始启动....");
        while (FLAG) {
            String data = count.incrementAndGet() + "";
            try {
                boolean offer = blockingQueue.offer(data, 2, TimeUnit.SECONDS);
                if (offer) {
                    System.out.println("#########################"+Thread.currentThread().getName() + ",生产队列" + data + "成功..");
                } else {
                    System.out.println(Thread.currentThread().getName() + ",生产队列" + data + "失败..");
                }
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println(Thread.currentThread().getName() + ",生产者线程停止...");
    }

    public void stop() {
        this.FLAG = false;
    }

}


