package com.itmayiedu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/20.
 * @by: DELL)
 */
public class Test003 {


    public  static  void main(String[] args){
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue <String>(4);
        blockingQueue.offer("1");
        blockingQueue.offer("2");
        blockingQueue.offer("3");
        blockingQueue.offer("4");
        blockingQueue.offer("5");
        blockingQueue.offer("6");

        System.out.println("===>"+blockingQueue.poll());
}
}
