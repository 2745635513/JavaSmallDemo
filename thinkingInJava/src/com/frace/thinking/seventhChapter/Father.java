package com.frace.thinking.seventhChapter;

/**
 * Created by frace on 2019/11/6 16:36
 * 这是一个父类，作为基类
 */
public class Father {
    private String s=" ";
    public void append(String s){
        this.s+=s;
    }
    public void hello(){
        append(" hello()");
    }
    public String toString(){
        return s;
    }
}
