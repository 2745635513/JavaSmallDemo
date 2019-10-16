package com.frs.Thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by frace on 2019/10/14 15:46
 */
public class Atomic {
    /**
     * 使用原子变量
     */
    public static AtomicInteger count=new AtomicInteger(0);

    public static void main(String[] args) {

        //打印字母
        Thread t1=new Thread(){
            @Override
            public void run() {
                int i=0;
                char ch='A';
                while (true){
                    if (i>26) break;
                    if (count.get()==2 && i<26){
                        System.out.print((char)(ch+i));
                        count.set(0);
                        i++;
                    }
                }
            }
        };
        //打印数字
        Thread t2=new Thread(){
            @Override
            public void run() {
                int i=1;
                while (true){
                    if (i>52)  break;
                    if (count.get()<2 && i<52){
                        count.incrementAndGet();
                        System.out.print(i);
                        i++;
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
