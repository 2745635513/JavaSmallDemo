package com.frace.thinking.thirdChapter.equalitySign;

/**
 * Created by frace on 2019/10/31 11:22
 */
public class Main {
    public static void main(String[] args) {
        ValueFirst v1=new ValueFirst();
        ValueFirst v2=new ValueFirst();
        v1.level=10;
        v2.level=20;
        System.out.println(v1.level+","+v2.level);//10,20
        v1.level=v2.level;//可以保持两个对象的独立
        System.out.println(v1.level+","+v2.level);// 20,20
        v1.level=30;
        System.out.println(v1.level+","+v2.level);//30,20
        v2.level=40;
        System.out.println(v1.level+","+v2.level);//30,40
        v1=v2;//对象的复制：对象的引用。两者包含的是相同的引用，指向相同对象。之前v1包含的对象引用被垃圾回收器自动清理掉。
        System.out.println(v1.level+","+v2.level);//40,40
        v1.level=50;
        System.out.println(v1.level+","+v2.level);//50,50
        v2.level=60;
        System.out.println(v1.level+","+v2.level);//60,60
    }
}
