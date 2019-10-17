package com.frs.proxy;

import org.junit.Test;

public class TestStaticProxy {
    @Test
    public void testStaticProxy(){

        //目标对象
        StaticDynamicTarget o=new StaticDynamicTarget();
        //代理对象
        StaticProxyDemo proxy=new StaticProxyDemo(o);
        proxy.printer();
    }
}
