package com.frace.thinking.thirdChapter;

import java.util.Random;

/**
 * Created by frace on 2019/10/31 13:52
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random1=new Random();//没有种子，任何类型都可能输出
        Random random2=new Random(10);
        System.out.println("没有种子，有范围");
        for (int i=0;i<5;i++){
            System.out.print(random1.nextInt(100) +" ");
        }
        System.out.println();
        System.out.println("没有种子，没有范围");
        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt() +" ");
        }
        System.out.println();
        System.out.println("有种子，10；有范围");
        for (int i = 0; i <5 ; i++) {
            System.out.print(random2.nextInt(100)+" ");
        }
        System.out.println();
        System.out.println("有种子：10；没有范围");
        for (int i = 0; i <5 ; i++) {
            System.out.print(random2.nextInt()+" ");
        }
    }
}
