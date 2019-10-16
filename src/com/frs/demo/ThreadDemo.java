package com.frs.demo;

public class ThreadDemo extends Thread  {
    private int ticket=100;

    public void run() {
        while (true){
            if (ticket>0){

                System.out.println(Thread.currentThread().getName()+"is saling " +ticket--);
            }else {
                break;
            }
        }
    }

}
