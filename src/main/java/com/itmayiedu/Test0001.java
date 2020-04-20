package com.itmayiedu;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/20.
 * @by: DELL)
 */
public class Test0001 {




    public  static  void main(String[] args){
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue <String>();
        concurrentLinkedQueue.offer("1张三");
        concurrentLinkedQueue.offer("2.李四");
        concurrentLinkedQueue.offer("3.孙悟空");
        concurrentLinkedQueue.add("5.猪八戒");


        for(int i=0;i<6;i++){
            System.out.println("获取队列:"+concurrentLinkedQueue.poll());
            System.out.println("获取队列的大小:"+concurrentLinkedQueue.size());
        }


    }
}
