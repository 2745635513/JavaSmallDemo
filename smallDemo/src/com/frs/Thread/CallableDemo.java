package com.frs.Thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable {

    private int id;
    public CallableDemo(Integer id){
        this.id=id;
    }
    @Override
    public Object call() throws Exception {
        int i=5;
        while (i>=0){
            System.out.println("Thread id" +i+" is working.");
            Thread.sleep(1000);
            i--;
        }
        return "result "+id;
    }
}
