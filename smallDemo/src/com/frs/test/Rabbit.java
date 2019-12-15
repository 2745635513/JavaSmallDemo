package com.frs.test;

/**
 * Created by frace on 2019/11/7 15:47
 */
public class Rabbit {
    public static void main(String[] args) {
        System.out.println(f(6));
    }
    public static int f(int n){
        if (n<5) return 1;
        return f(n-1)+f(n-4);
    }
}
