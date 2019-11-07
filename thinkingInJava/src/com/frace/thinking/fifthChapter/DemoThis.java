package com.frace.thinking.fifthChapter;

/**
 * Created by frace on 2019/11/2 16:11
 * 测试 this 关键字
 */
public class DemoThis {
    public static int age;
    public String name;
    DemoThis(){
        System.out.println("默认构造器");
    }
    static void show(){
        age=19;
        System.out.println("show.....");
    }
    DemoThis(String name){
        System.out.println("参数构造器,参数："+name);
    }
    DemoThis(String name,int age){
//        this();
        this(name);//和前一行只可以存在一行
        age=this.age;
        System.out.println(name+" age is "+age);
    }

    void bark(int i){
//        this("laincarl");//调用构造器只可以在构造器中，并且要在最起始处
//        name("dog");
        System.out.println("it is barking "+i);
//        System.out.println("five minutes pass");
//        eat();
    }

    void name(String name){
        System.out.println("name: "+name +";age :"+age);
    }

    static void eat(){
        int i;
        Integer integer;
//        integer++;//依然会报错
//        i++;//没有初始化
        System.out.println("eating ......");
    }

    public static void main(String[] args) {
        DemoThis demoThis=new DemoThis("frace",17);
        demoThis.bark(12);
        demoThis.show();
    }
}

