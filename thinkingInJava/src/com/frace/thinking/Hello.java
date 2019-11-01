package com.frace.thinking;

import static java.lang.System.out;

/**
 * Created by frace on 2019/10/30 14:13
 */
public class Hello extends com.frace.thinking.variable.Hello {
    public static void main(String[] args) {
//        com.frace.thinking.variable.Hello hello=new com.frace.thinking.variable.Hello(){};
//        System.out.println(hello.publicHello);

//        System.getProperties().list(out);
        out.println(System.getProperty("user.name"));
        out.println(System.getProperty("java.libary.path"));
        out.println(12);
    }
}
