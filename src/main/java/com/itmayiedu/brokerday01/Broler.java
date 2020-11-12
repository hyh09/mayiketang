package com.itmayiedu.brokerday01;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by dell on 2020/7/3.
 */
public class Broler {

    // 队列存储消息的最大数量
    private final  static  int MAX_SIZE =3;

    private  static ArrayBlockingQueue<String>  messagQueue = new ArrayBlockingQueue<String>(MAX_SIZE);


    //生产消息
    public  static  void produce(String msg){
        if(messagQueue.offer(msg)){
           System.out.println("成功向消息处理中心投递消息:"+msg+",当前的消息数量是："+messagQueue.size());
        }else {
            System.out.println("消息处理中心内暂存的 达到最大负荷，不能继续存放消息!");
        }

        System.out.println("================================");

    }

    //消费消息
    public  static  String consume(){
        String msg = messagQueue.poll();
        if(msg !=null){
            System.out.println("已经消费消息:"+msg+"，当前暂存的消息数量是;"+messagQueue.size());
        }else {
            System.out.println("消息处理中心内没有消息可供消费!!");
        }
        System.out.println("=======================================");
        return msg;
    }













}
