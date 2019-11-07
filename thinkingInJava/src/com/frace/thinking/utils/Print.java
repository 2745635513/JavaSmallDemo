package com.frace.thinking.utils;

/**
 * Created by frace on 2019/11/5 12:45
 */
public class Print {
    //print with a newline
    public static void print(Object object){
        System.out.println(object);
    }
    //print a newline by itself
    public static void print(){
        System.out.println();
    }
    //print whthout line break
    public static void printnb(Object object){
        System.out.print(object);
    }
    //new from SE5 printf() (from C)
    public static void printf(String format,Object... args){
        System.out.printf(format,args);
    }
}
