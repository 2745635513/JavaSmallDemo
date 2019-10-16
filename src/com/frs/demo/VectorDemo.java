package com.frs.demo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(3,2);
        System.out.println("默认的容量"+vector.capacity());
        vector.add(1);
        vector.add("2");
        vector.add(3.4);
        System.out.println("现在的容量"+vector.capacity());
        vector.add(7.8F);
        System.out.println("扩容后的容量："+vector.capacity());
        Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        vector.remove(2);
        System.out.println("删除后的容量"+vector.capacity());
        Enumeration enumeration1=vector.elements();
        while (enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }
    }
}
