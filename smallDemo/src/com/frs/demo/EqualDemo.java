package com.frs.demo;

public class EqualDemo {
    public static void main(String[] args) {
        String a="1";
        String b="1";
        System.out.println("String中的==比较的是地址:"+(a==b));
        System.out.println("String中的equals比较的是值:"+a.equals(b));
        Integer one =1;
        Integer two=1;
        System.out.println("equals比较的是两个对象是否相同："+a.equals(one));
        System.out.println("==比较的是两个对象是否是同一个对象"+ (two==one));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(one.hashCode());
    }
}
