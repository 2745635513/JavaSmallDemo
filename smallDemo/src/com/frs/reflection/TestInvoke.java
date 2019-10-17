package com.frs.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by frace on 2019/10/15 15:53
 */
public class TestInvoke {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> c = OnePerson.class;
        Object o = c.newInstance();
        Method method=c.getMethod("printer", int.class, int.class);//为什么有父类时，不能调用这个方法
        Object result=method.invoke(o,12,14);
        System.out.println(result);

    }
}
