package com.frace.thinking.hexPackage;

/**
 * Created by frace on 2019/10/31 14:38
 */
public class Demo {
    public static void main(String[] args) {
//        System.out.println( 0b11);//较小类型会被转化成int: 3
//        byte b=0x8f;//超出范围，会报错
//        System.out.println(Integer.toBinaryString('a'));//110001
//        System.out.println(Integer.toBinaryString(0b10));//10
//        byte b=129;//-128 ~ 127
        System.out.println("-1: "+Integer.toBinaryString(-1));//-1: 11111111111111111111111111111111
        System.out.println("+1:"+Integer.toBinaryString(+1));//+1:1
        System.out.println("-3: "+Integer.toBinaryString(-3));//-3: 11111111111111111111111111111101
    }
}
