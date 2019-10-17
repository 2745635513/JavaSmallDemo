package com.frs.Thread.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by frace on 2019/10/14 15:41
 */
public class TestPrinter {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
        LetterPrinter t1 =new LetterPrinter(bq);
        NumberPriter t2=new NumberPriter(bq);
        t1.start();
        t2.start();
    }
}
