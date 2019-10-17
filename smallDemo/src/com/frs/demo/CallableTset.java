package com.frs.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTset {
    public static void main(String[] args) {
        Callable<String> callable=new CallableDemo(2);
        FutureTask<String> futureTask= new FutureTask<>(callable);
        new Thread(futureTask).start();

        while (!futureTask.isDone()){
            try {
                System.out.println("检查线程"+Thread.currentThread().getName()+"执行");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String result="";
        try {
            result=futureTask.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
