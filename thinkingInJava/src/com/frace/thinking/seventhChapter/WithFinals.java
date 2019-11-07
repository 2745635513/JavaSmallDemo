package com.frace.thinking.seventhChapter;

import java.awt.image.VolatileImage;

/**
 * Created by frace on 2019/11/6 21:57
 */
public class WithFinals {
    private final void f(){
        System.out.println("WithFinals.f()");

    }
    private void g(){
        System.out.println("WithFinals.g()");
    }

    void h(){
        System.out.println("WithFinals.h()");
    }

    protected void p(){
        System.out.println("WithFinals.p()");
    }
}
