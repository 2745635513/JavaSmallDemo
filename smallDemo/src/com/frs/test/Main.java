package com.frs.test;

public class Main implements Father {


    public static int m=1;
    public static void add(int i){
        i=i+2;
        System.out.println(m);
    }
    public static void main(String[] args) {
        add(m);

    }
}
