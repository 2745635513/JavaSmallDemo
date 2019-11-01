package com.frace.thinking.staticDemo;

/**
 * Created by frace on 2019/10/31 9:26
 */
public class StaticDemo {
    private static int privateI;
    public static int publicI;
    static int defaultI=21;

    public static void main(String[] args) {
        StaticDemo.publicI=2;
        StaticDemo staticDemo=new StaticDemo();
        StaticDemo staticDemo1=new StaticDemo();
        System.out.println(staticDemo.defaultI);
    }
}
