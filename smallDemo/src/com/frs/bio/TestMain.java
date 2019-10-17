package com.frs.bio;

import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                //1. bio 一连接一线程的处理
                ServerNormal.start();
//                try {
//                    //2.bio 使用线程池 实现1个或多个线程处理N个客户端的模型（但是底层还是使用的同步阻塞I/O）
//                    ServerBetter.start();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
            }
        }).start();
        try {
            //避免客户端优先启动
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动客户端
        final char operators[] = {'+', '-', '*', '/'};
        final Random random = new Random();
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    //随机产生算术表达式
                    String expression = random.nextInt(10) + "" + operators[random.nextInt(4)] + (random.nextInt(10) + 1);
                    Client.send(expression);

                    try {
                        Thread.currentThread().sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
