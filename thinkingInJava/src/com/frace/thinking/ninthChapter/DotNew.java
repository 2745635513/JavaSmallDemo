package com.frace.thinking.ninthChapter;

/**
 * Created by frace on 2019/11/18 18:19
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dotNew=new DotNew();
        Inner inner=dotNew.new Inner();
    }
}
