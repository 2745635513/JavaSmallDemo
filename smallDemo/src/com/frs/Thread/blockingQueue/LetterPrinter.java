package com.frs.Thread.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by frace on 2019/10/14 15:39
 */
public class LetterPrinter extends Thread {
    private BlockingQueue<String> bq;
    public LetterPrinter(BlockingQueue<String> bq){
        this.bq=bq;
    }

    @Override
    public void run() {
        char ch='A';
        for (int i = 0; i < 26; i++) {
            try {
                bq.take();
                bq.take();
                System.out.print((char) (ch+i));
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
