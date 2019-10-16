package com.frs.reflection;

import java.lang.reflect.Array;

/**
 * Created by frace on 2019/10/15 17:44
 */
public class CreateArray {
    /**
     * 利用反射创建数组
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("java.lang.Integer");
        Object array=Array.newInstance(c,5);
        Array.set(array,0,14);
        Array.set(array,1,16);
        Array.set(array,3,18);
        System.out.println(Array.get(array,3));

    }
}
