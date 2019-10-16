package com.frs.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyClass {

    //维护一个目标对象
    private Object target;
    public DynamicProxyClass(Object target){
        this.target=target;
    }

    //为目标对象生成一个代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target
                        .getClass()
                        .getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("i am dynamic proxy class.");
                        //执行目标对象的方法
                        Object returnValue=method.invoke(target,args);
                        System.out.println(returnValue);
                        return null;
                    }
                });
    }
}
