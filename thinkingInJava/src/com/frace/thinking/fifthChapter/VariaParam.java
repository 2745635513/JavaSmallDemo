package com.frace.thinking.fifthChapter;

/**
 * Created by frace on 2019/11/2 21:30
 */
public class VariaParam {
    static void f1(int i, Character... characters) {
        System.out.println("first");
    }

    static void f1(char c
            , Character... characters) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f1(1, '1');
        f1('a', 'b');
    }
}
