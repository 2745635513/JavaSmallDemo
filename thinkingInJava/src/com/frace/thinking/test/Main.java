package com.frace.thinking.test;


/**
 * Created by frace on 2019/11/6 15:31
 */
public class Main {
    private class Inner{
        public Inner(){
            System.out.println("nihao");
        }
    }
    public Main(){
        Inner inner=new Inner();
        System.out.println("main");
    }

    public static void main(String[] args) {
        Main main=new Main();
    }
}
