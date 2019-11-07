package com.frace.thinking.sixthChapter;

/**
 * Created by frace on 2019/11/5 15:36
 */
public class ChocolatePie extends Cookie {
    public ChocolatePie(){
        System.out.println("ChocolatePie constructor");
    }
    public void chomp(){
        bite();
    }

    public static void main(String[] args) {
        ChocolatePie chocolatePie=new ChocolatePie();
        chocolatePie.chomp();
    }
}
