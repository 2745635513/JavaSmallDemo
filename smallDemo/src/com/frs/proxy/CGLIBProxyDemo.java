//package com.frs.proxy;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class CGLIBProxyDemo implements MethodInterceptor {
//    //维护一个目标对象
//    private Object target;
//    public CGLIBProxyDemo(Object target){
//        this.target=target;
//    }
//
//    //为目标对象生成代理对象
//    public Object getPorxyInstance(){
//        Enhancer en=new Enhancer();
//        //设置父类
//        en.setSuperclass(target.getClass());
//        //回调函数
//        en.setCallback(this);
//        //创建子类对象代理
//        return en.create();
//    }
//
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println(" i am a child class by cglib proxy ");
//        System.out.println(method.invoke(target,objects));
//        System.out.println("cglib over.");
//        return null;
//    }
//}
