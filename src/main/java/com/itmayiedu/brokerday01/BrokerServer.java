package com.itmayiedu.brokerday01;

import com.sun.corba.se.pept.broker.Broker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dell on 2020/7/3.
 */
public class BrokerServer implements  Runnable {

    public  static  int SERVICE_PORT = 9999;

    private   final Socket  socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedReader  in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            while (true){
                String  str = in.readLine();
                if(str == null){
                    continue;
                }
                System.out.println("接收到原始数据:"+str);
                if(str.equals("CONSUME")){
                    //从消息队列中消费一条消息
                    String  message = Broler.consume();///
                    out.println(message);
                    out.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    public  static  void main(String[] args) throws IOException {
        ServerSocket  serverSocket = new ServerSocket(SERVICE_PORT);
        while (true){
            BrokerServer  brokerServer = new BrokerServer(serverSocket.accept());
            new  Thread(brokerServer).start();
        }
    }
















}
