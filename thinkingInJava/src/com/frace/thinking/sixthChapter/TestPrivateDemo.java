package com.frace.thinking.sixthChapter;

import static com.frace.thinking.utils.Print.print;

/**
 * Created by frace on 2019/11/5 15:29
 */
public class TestPrivateDemo {
    public static void main(String[] args) {
//        PrivateDemo privateDemo=new PrivateDemo();//这样是无法访问的，因为无参构造器是除了自己谁也无法访问的
        PrivateDemo privateDemo=PrivateDemo.sundae();//可以通过这样访问
        print(privateDemo.i);
    }
}
