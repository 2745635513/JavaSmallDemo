package com.frace.thinking;

/**
 * Created by  @anthor frace on 2019/10/31 14:09
 * 递增 ++，递减 --
 * 唯一具有“副作用”的操作符，会使用自己的值，也会改变操作数
 */
public class AddAddSubSub {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i++: "+ i++);
        System.out.println("i: "+i);
        System.out.println("++i: "+ ++i);
        System.out.println("i: "+i);
        System.out.println("i--: "+ i--);
        System.out.println("i: "+i);
        System.out.println("--i: "+ --i);
        System.out.println("i: "+ i);
    }
}
