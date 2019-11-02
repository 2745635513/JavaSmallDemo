package com.frace.thinking;

/**
 * Created by frace on 2019/11/1 20:54
 * 这是：初始化
 */
public class InitializeDemo {
    //对象new的时候是不会调用的
    static  int i;
    InitializeDemo() {
        System.out.println("无参构造器");
        i = 3;
    }

    //上下两个构造器就是：强制重载方法名的表现
    //方法重载：方法名相同，参数不同
    InitializeDemo(int i) {
        this.i = i;
        System.out.println("有参构造器，参数：" + i + ",方法体外的变量i值：" + this.i);
    }

    void info(){}

    //主函数
    public static void main(String[] args) {
        InitializeDemo initializeDemo = new InitializeDemo();//在Java中“创建”和“初始化”是捆绑在一起的
        System.out.println("创建对象后的变量i值：" + initializeDemo.i);
        System.out.println(i);
        InitializeDemo initializeDemo1 = new InitializeDemo(2);
        System.out.println("创建对象后的变量i值：" + initializeDemo1.i);
        System.out.println(i);
    }
}
