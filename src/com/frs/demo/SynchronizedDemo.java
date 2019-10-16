package com.frs.demo;

public class SynchronizedDemo {
    public void syncBlock(){
        System.out.println("blocking");
    }

    public synchronized void syncMethod(){
        System.out.println("method");
    }
}
