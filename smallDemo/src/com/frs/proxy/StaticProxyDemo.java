package com.frs.proxy;

public class StaticProxyDemo implements ProxyInterfaceDemo {

    private ProxyInterfaceDemo target;

    public StaticProxyDemo(ProxyInterfaceDemo target) {
        this.target = target;
    }

    @Override
    public void printer() {
        System.out.println("i am a staticDemo proxy class");
        target.printer();
        System.out.println("test over.");
    }
}
