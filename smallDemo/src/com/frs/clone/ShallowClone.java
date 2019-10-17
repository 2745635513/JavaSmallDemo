package com.frs.clone;

public class ShallowClone {
    public static void main(String[] args) {
        /**
         * 最简单的就是复制引用
         */
        Pig pig=new Pig("lainCarl");
        pig.printer();

        Pig pig1=pig;
        pig1.name="frace";
        pig.printer();
        System.out.println((pig==pig1 ? "是" :"不是") +"浅拷贝");
    }
}
