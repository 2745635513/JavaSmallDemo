package com.frace.thinking.methods;

/**
 * Created by frace on 2019/11/1 16:13
 */

/**
 * 这是一个打印素数的类
 */
public class PrinterPrimeNumber {
    public static void main(String[] args) {
        //方法一：使用双for循环，取余操作符得出
        //第一个循环是取数
        for (int i = 1; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
