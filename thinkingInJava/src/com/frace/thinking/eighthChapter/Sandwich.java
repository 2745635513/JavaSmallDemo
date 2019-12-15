package com.frace.thinking.eighthChapter;


/**
 * Created by frace on 2019/11/8 11:29
 */
public class Sandwich extends PortableLunch {
    private Bread b=new Bread();
    public Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    public Sandwich(){
        System.out.println("Sandwich Constructor");
    }

    public static void main(String[] args) {
        /**
         * 输出：
         * Meal Constructor
         * Lunch Constructo
         * PortableLunch Constructor
         * Bread Constructor
         * Cheese Constructor
         * Lettuce Constructor
         * Sandwich Constructor
         */
        new Sandwich();

    }
}
