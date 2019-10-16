package com.frs.proxy;

import org.junit.Test;

public class TestDynamicProxy {
    @Test
    public void getDynamicProxy(){
        ProxyInterfaceDemo o=new StaticDynamicTarget();
        System.out.println(o.getClass());
        ProxyInterfaceDemo proxy=(ProxyInterfaceDemo) new DynamicProxyClass(o).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.printer();
    }
}
