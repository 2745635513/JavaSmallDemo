package com.frace.thinking.thirdTeenChapter;


/**
 * Created by frace on 2019/12/7 20:30
 * 正则表达式
 */
public class Main {
    static {
        System.out.println("static block");
    }
    Main(){
        System.out.println("默认构造器");
    }
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        System.out.println("-1234".matches("-?\\d+"));
//        System.out.println(5^2);//异或
        try {
            Class.forName("Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Class not find");
        }
        System.out.println(Main.class);//class com.frace.thinking.thirdTeenChapter.Main
        System.out.println(Main.class.newInstance());//默认构造器 com.frace.thinking.thirdTeenChapter.Main@1b6d3586
    }
}
