package com.frace.thinking.ninthChapter;

/**
 * Created by frace on 2019/11/19 12:03
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i=11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7=new Parcel7();
        Contents contents=parcel7.contents();
        System.out.println(contents.value());
    }
}
