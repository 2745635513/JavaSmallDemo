package com.frace.thinking.seventhChapter;


import static com.frace.thinking.utils.Print.print;

/**
 * Created by frace on 2019/11/6 16:38
 */
public class Child extends Father {
    public void hi(){
        append(" hi()");
    }
    public void hello(){
        this.hi();
        super.hello();
        append(" end");
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.hello();
        print(child);
    }
}
