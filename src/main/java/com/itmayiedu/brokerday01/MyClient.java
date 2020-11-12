package com.itmayiedu.brokerday01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by dell on 2020/7/3.
 */
public class MyClient {

    //生产消息
    public  static  void  produce(String message)throws  Exception{
        Socket socket=  new Socket(InetAddress.getLocalHost(),BrokerServer.SERVICE_PORT);
     //   try {
            PrintWriter  out = new PrintWriter(socket.getOutputStream());
            out.print(message);
            out.flush();
        //}catch (Exception)
    }

    //消费 消息
    public  static  String  consume() throws  Exception{
        Socket socket=  new Socket(InetAddress.getLocalHost(),BrokerServer.SERVICE_PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter  out = new PrintWriter(socket.getOutputStream());

        out.println("COSUME");
        out.flush();
        String message = in.readLine();
        return  message;
    }







}
