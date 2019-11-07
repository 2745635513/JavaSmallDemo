package com.frace.thinking.seventhChapter;

/**
 * Created by frace on 2019/11/6 21:58
 */
public class OverridePrivate extends WithFinals {
//    @Override//是不可以从父类覆盖的
    private final void f(){
        System.out.println("OverridePrivate.f()");
    }
//    @Override//不可以
    private void g(){
        System.out.println("OverridePrivate.g()");
    }
    @Override//是可以的
    void h(){
        System.out.println("WithFinals.h()");
    }
    @Override
    protected void p(){
        System.out.println("WithFinals.p()");
    }

}
