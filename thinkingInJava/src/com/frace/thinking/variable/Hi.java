package com.frace.thinking.variable;

/**
 * Created by frace on 2019/10/30 15:30
 */
public class Hi extends Hello {
    public static void main(String[] args) {
        Hello h =new Hello() {
        };
        System.out.println(h.defaultHello);
        System.out.println(h.publicHello);
        System.out.println(h.protectedHello);
    }
}
