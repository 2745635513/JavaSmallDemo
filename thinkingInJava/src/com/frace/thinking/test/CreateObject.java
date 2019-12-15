package com.frace.thinking.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by frace on 2019/11/7 17:23
 * 创建对象
 */
public class CreateObject {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        HelloWorld hello=HelloWorld.class.newInstance();
        HelloWorld hello1= HelloWorld.class.getConstructor().newInstance();
        HelloWorld helloWorld=new HelloWorld();
        HelloWorld hello2= (HelloWorld) helloWorld.clone();
    }
}
