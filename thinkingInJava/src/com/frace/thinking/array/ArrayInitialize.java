package com.frace.thinking.array;

/**
 * Created by frace on 2019/11/2 20:56
 * 数组初始化
 */
public class ArrayInitialize {
    //int[] a;  int a[];
    ArrayInitialize(String name){
        System.out.println("有参数构造器，参数为："+name);
    }
    static {
        System.out.println("静态代码块");//一定会执行的
    }
    public static void main(String[] args) {
        ArrayInitialize[] arrayInitializes;//如果没有new，构造器是不会执行的
    }
}
