package com.frs.test;

/**
 * Created by frace on 2019/10/31 10:24
 */
public class PrinterAllStrings {
    /**
     * 输入一个字符串，把他所有组合的情况打印出来，不要有重复的，无序
     * 例如：abc：a,b,c,ab,ac,bc,abc
     */
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            doPrinter(sb,0, i,str);
        }
    }

    //递归输出组合
    public static void doPrinter(StringBuilder sb,int start, int length, String str) {
        if (length == -1) {
            System.out.println(sb.toString());
            return;
        }
        if (start==str.length()) return;

        sb.append(str.charAt(start));
        doPrinter(sb,start+1,length-1,str);
        sb.deleteCharAt(sb.length()-1);
        doPrinter(sb,start+1,length,str);
    }
}
