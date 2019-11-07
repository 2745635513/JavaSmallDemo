package com.frace.thinking.test;

import com.frace.thinking.sixthChapter.Cookie;

/**
 * Created by frace on 2019/11/5 15:38
 */
public class ChocolatePie extends Cookie {
    public ChocolatePie(){
        System.out.println("ChocolatePie constructor");
    }
    public void chomp(){
        bite();//如果是包访问权限无法访问的,
    }

    public static void main(String[] args) {
        com.frace.thinking.sixthChapter.ChocolatePie chocolatePie=new com.frace.thinking.sixthChapter.ChocolatePie();
        chocolatePie.chomp();
    }
}
