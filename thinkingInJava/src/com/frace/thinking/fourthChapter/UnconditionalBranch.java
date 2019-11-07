package com.frace.thinking.fourthChapter;

/**
 * Created by frace on 2019/11/1 16:36
 */

/**
 * 这是一个展示无条件分支的作用例子
 * 无条件分支：return ，break，continue
 */
public class UnconditionalBranch {
    public static void main(String[] args) {
//        System.out.print("break: ");
//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 5; i++) {
//                System.out.print(" " + i);
//                if (i == 2) {
//                    break;
//                }
//            }
//        }
        //break:  0 1 2 0 1 2 0 1 2---强行跳出循环，不必执行循环中的剩余语句
//        System.out.print("\ncontinue：");
//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 5; i++) {
//                System.out.print(" " + i);
//                if (i == 2) {
//                    continue;
//                }
//            }
//        }
        //continue： 0 1 2 3 4 0 1 2 3 4 0 1 2 3 4------停止执行当前的迭代，然后退出循环起始处，开始下一次迭代
        //使用标签退出循环,,continue label--跳到循环顶部，break label：跳出循环
//        int count=0;
//        outer:
//        while (true){
//            System.out.println("\nOuter leap");
//            while (true){
//                count++;
//                System.out.println("count: "+count);
//                if (count==1){
//                    System.out.println("continue");
//                    continue ;
//                }
//                if (count==3){
//                    System.out.println("break");
//                    break ;
//                }
//                if (count==5){
//                    System.out.println("continue outer");
//                    continue outer;
//                }
//                if (count==7){
//                    System.out.println("break outer");
//                    break outer;
//                }
//            }
//    }
            /**
             * Outer leap
             * count: 1
             * continue
             * count: 2
             * count: 3
             * break
             *
             * Outer leap
             * count: 4
             * count: 5
             * continue outer
             *
             * Outer leap
             * count: 6
             * count: 7
             * break outer
             */
//            String a="caaaa";
//            Double d=0.2;
            //选择因子：char，short，byte，int，整型的包装类型，String ，enum
//            switch (d){
//                case 0.1:
//                    System.out.println(0.1);break ;
//
//            }

    }
}
