package com.frace.thinking.eighthChapter;

/**
 * Created by frace on 2019/11/8 12:03
 */
public class ThisDemo {
    private static long i = 0;
    private final long id = i++;

    ThisDemo(){
        System.out.println("creating "+this);
    }

    public String toString() {
        return "ThisDemo " + id;
    }

    public static void main(String[] args) {
        ThisDemo[] thisDemo={new ThisDemo(),new ThisDemo()};
        /**
         * creating ThisDemo 0
         * creating ThisDemo 1
         */
    }
}
