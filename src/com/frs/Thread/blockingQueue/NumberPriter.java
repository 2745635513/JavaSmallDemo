package com.frs.Thread.blockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created by frace on 2019/10/14 15:35
 */
public class NumberPriter extends Thread {
    private BlockingQueue<String> bq;
    public NumberPriter(BlockingQueue<String> bq){
        this.bq=bq;
    }

    @Override
    public void run() {
        for (int i = 1; i < 53; i++) {
            try {
                System.out.print(i);
                bq.put((i)+""+(i+1));
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
