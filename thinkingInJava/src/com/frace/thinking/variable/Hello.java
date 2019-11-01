package com.frace.thinking.variable;

/**
 * Created by frace on 2019/10/30 15:29
 */
public abstract class Hello {
    public int publicHello;//类内部，本包，子类，外部包
    protected int protectedHello;//访问权限：本包，类内部，子类；不可以访问：外部包
    int defaultHello;//访问权限：本包，类内部；不可以访问：子类，外部包
    private int privateHello;//只可以类内部使用的字段

}
