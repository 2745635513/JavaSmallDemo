package com.frs.demo;

public class ArrayDemo extends AbastractDemo  {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = "你好";
        objects[1]=2;
        System.out.println(objects.getClass().getName());
        for (Object item:objects){
            System.out.println(item);
        }
//        System.out.println("round向上取值"+(Math.round(-1.5)));
//        System.out.println(Math.round(1.4));
//        System.out.println("ceil向上取值："+(Math.ceil(-1.5)));
//        System.out.println(Math.ceil(1.4));
        ArrayDemo demo=new ArrayDemo();
        demo.move();
        demo.eat();

    }

    @Override
    void move() {
        System.out.println("子类正在move now");
    }
}
