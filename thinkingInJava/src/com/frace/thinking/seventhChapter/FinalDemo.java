package com.frace.thinking.seventhChapter;

import java.util.Random;

/**
 * Created by frace on 2019/11/6 19:09
 */
public class FinalDemo {
    private int[] a;
    final int finalA =1;//如果没有初始化是会被报错的
    static final int staticFinalA=(new Random(64)).nextInt(10);//如果没有初始化是会被报错的
    private final int blankFinal;//空白final

    FinalDemo(){
        blankFinal=2;//构造器中定义
    }

    public void hello(){
//        blankFinal=2;
    }

    public static void main(String[] args) {

    }
}
