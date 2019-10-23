package com.frs.exception;

public class MyException extends Exception {
    public  MyException(){
        System.out.println("无参构造器");
    }
    public MyException(String msg){
        super(msg);
        System.out.println("有参构造器");
    }

}
