package com.frace.thinking.exceptionChapter;

/**
 * Created by frace on 2019/11/24 15:57
 */
class FullConstructors{
    public static void f() throws MyException{
        System.out.println("Throwing exception from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing exception from g()");
        throw new MyException("Originated in g()");
    }
}
public class MyException extends Exception {
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }

    public static void main(String[] args) {
        try {
            FullConstructors.f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try {
            FullConstructors.g();
        }catch (MyException e){
            e.printStackTrace(System.err);
        }
    }
}
