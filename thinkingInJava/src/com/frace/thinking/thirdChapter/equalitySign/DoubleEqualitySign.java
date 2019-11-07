package com.frace.thinking.thirdChapter.equalitySign;

/**
 * Created by frace on 2019/10/31 14:19
 * 这是一个研究双等号的测试
 * 如果自定义一个类，没有重写equals方法，那么默认比较的依然是地址
 */
public class DoubleEqualitySign {
    public static void main(String[] args) {
        int i=2;
        int j=2;
        System.out.println(i==j);//true
        Integer i2=3;
        Integer j2=3;
        System.out.println(i2==j2);//true
        System.out.println(i2.equals(j2));//true
        Integer i3=new Integer(4);
        Integer j3=new Integer(4);
        System.out.println(i3==j3);//false
        System.out.println(i3.equals(j3));//true

    }
}
