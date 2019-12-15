package com.frace.thinking.eighthChapter;

/**
 * Created by frace on 2019/11/8 11:32
 */
public class OrderInitialization {
    Window w1=new Window(11);
    public static void main(String[] args) {
        House house = new House();
        house.f();

        /**
         * Window(1)
         * Window(2)
         * Window(3)
         * House()
         * Window(33)
         * f()
         */
    }
}
class Window {
    Window(int i) {
        System.out.println("Window(" + i + ")");
    }
}
class House {
    Window window = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
