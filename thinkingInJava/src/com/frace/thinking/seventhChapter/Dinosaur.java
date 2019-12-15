package com.frace.thinking.seventhChapter;

/**
 * Created by frace on 2019/11/7 18:03
 */
public final class Dinosaur {
    int j=1;
    final int i;
    Dinosaur(){
        System.out.println("Dinosaur无参构造器");
        i=3;
    }
    Dinosaur(String name){
        i=4;
        System.out.println("Dinosaur 有参构造器");
    }
}
