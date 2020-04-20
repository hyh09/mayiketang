package com.itmayiedu.produce;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public  class  Test004{


    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>(3);
        ProducerThread producerThread = new ProducerThread(blockingQueue);
        ConsumerThread consumerThread = new ConsumerThread(blockingQueue);
        Thread t1 = new Thread(producerThread);
        Thread t2 = new Thread(consumerThread);
        t1.start();
        t2.start();
        //10秒后 停止线程..
        try {
            Thread.sleep(10*1000);
            producerThread.stop();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
