package com.frace.thinking.staticDemo;

/**
 * Created by frace on 2019/10/31 9:26
 */
public class StaticDemo {
    StaticDemo(){
        System.out.println("默认构造器");
    }
    private static int privateI;
    public static int publicI;
    static int defaultI=21;

    public static void main(String[] args) {
//        StaticDemo.publicI=2;
//        StaticDemo staticDemo=new StaticDemo();
//        StaticDemo staticDemo1=new StaticDemo();
//        System.out.println(staticDemo.defaultI);

//        StaticDemo a=new StaticDemo();
//        System.out.println("static i:="+privateI);//0
//        System.out.println("a.i="+a.privateI);//0
//        a.privateI=12;
//        StaticDemo b=new StaticDemo();
//        System.out.println("static i:="+privateI);//12
//        System.out.println("b.i:="+b.privateI);//12
        StaticDemo.privateI=12;
    }
}
