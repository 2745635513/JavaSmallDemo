package com.frs.proxy;

import org.junit.Test;

public class TestCGLIBProxy {
    @Test
    public void getProxy(){
        //target class
        CGLIBTarget o=new CGLIBTarget();
        System.out.println(o.getClass());
        //PROXY CLASS
        CGLIBTarget proxy= (CGLIBTarget) new CGLIBProxyDemo(o).getPorxyInstance();
        System.out.println(proxy.getClass());
        //执行代理对象
        proxy.printer();
    }
}
