package com.frace.thinking.eighthChapter;

/**
 * Created by frace on 2019/11/8 10:30
 */
public class Circle extends Shape {
//    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }
    int i=9;//变量默认是包访问权限
    //方法默认是包访问权限
    String what(){
        return "Circle what()";
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
    }
}
