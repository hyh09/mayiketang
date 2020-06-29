package com.itmayiedu.javaee.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.UUID;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/22.
 * @by: DELL)
 */
public class ArrayCapacityexpansion {


    @Test
    public  void  Test1(){
        String [] strings = {"1","2","3"};
        String []  strings1 = new String[10];
        System.arraycopy(strings,1,strings1,2,strings.length-1);
        strings = strings1;
        System.out.println("====>"+strings);
        for(int j=0;j<strings.length;j++) {
            System.out.print(strings[j]+"  ");
        }
    }





    @Test
    public  void Test2(){
        final HashMap<String, String> map = new HashMap<String, String>(2);
        for (int i = 0; i < 1000000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(UUID.randomUUID().toString(), "");
                    System.out.println("map:"+map.size());
                }
            }).start();
        }
    }
}
