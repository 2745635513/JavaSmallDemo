package com.frs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by frace on 2019/10/15 15:41
 */
public class CreateInstance {
    public static void main(String[] args) {
        //1 通过newInstance()
        Class c=String.class;
        try {
            Object o=c.newInstance();
            o="123";
            System.out.println(o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //2 先通过class对象获取到构造器，然后利用构造器去创建新的实例
        Class c2=String.class;
        try {
            Constructor constructor=c2.getConstructor(String.class);
            try {
                Object o2=constructor.newInstance("123");
                System.out.println(o2);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
