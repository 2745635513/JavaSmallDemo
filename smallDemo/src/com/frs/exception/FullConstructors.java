package com.frs.exception;

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("throws myexception from f()");
        throw new MyException();//方法调用处
    }

    public static void g() throws MyException {
        System.out.println("throws myexception from g()");
        throw new MyException("起源于g()");
    }

    public static void main(String[] args) {
        try {
            f();//异常抛出处
        }catch (MyException m){
//            m.printStackTrace(System.out);
            m.printStackTrace();
        }
        try {
            g();
        }catch (MyException m){
//            m.printStackTrace(System.out);
            m.printStackTrace();
        }
    }
}
