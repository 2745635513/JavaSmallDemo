package com.frace.thinking.staticDemo;

/**
 * Created by frace on 2019/10/31 9:27
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(StaticDemo.publicI);
        StaticDemo.publicI=3;
        StaticDemo staticDemo=new StaticDemo();
        StaticDemo staticDemo1=new StaticDemo();
        System.out.println(staticDemo.publicI+","+staticDemo1.publicI);
        staticDemo1.publicI=4;
        System.out.println(staticDemo.publicI+","+staticDemo1.publicI);
        System.out.println(staticDemo.defaultI);
    }
}
