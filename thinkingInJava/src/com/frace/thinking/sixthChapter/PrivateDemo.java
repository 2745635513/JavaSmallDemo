package com.frace.thinking.sixthChapter;

/**
 * Created by frace on 2019/11/5 15:28
 */
public class PrivateDemo {
    private PrivateDemo(){}

    public int i=0;

    static PrivateDemo sundae(){
        return new PrivateDemo();
    }
}
