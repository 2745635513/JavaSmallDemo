package com.frace.thinking.test;

import java.io.Serializable;

/**
 * Created by frace on 2019/11/7 17:25
 */
public class HelloWorld implements Cloneable {
    public HelloWorld(){
        System.out.println("HelloWorld默认构造器");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
