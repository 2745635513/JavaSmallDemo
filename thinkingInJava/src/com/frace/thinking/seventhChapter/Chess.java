package com.frace.thinking.seventhChapter;

/**
 * Created by frace on 2019/11/6 17:01
 */
public class Chess extends BoardGame {
    Chess() {
        //当基类有无参构造器，那么不用特意super去调用。但是如果你想调用有参的就可以使用super去指定构造器
        super(1);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess=new Chess();
        System.out.println(
        );
    }
}
