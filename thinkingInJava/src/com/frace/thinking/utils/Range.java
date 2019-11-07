package com.frace.thinking.utils;

/**
 * Created by frace on 2019/11/5 12:53
 */
public class Range {
    //produce a sequence [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    //produce a sequence [start..end)
    public static int[] range(int start, int end) throws Exception {
        int length=end - start;
        if (length<0){
            throw new Exception("数组参数异常");
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i]=start+i;
        }
        return result;
    }
    //produce a sequence [start..end) incrementing by step
    public static int[] range(int start,int end,int step){
        int length=(end-start)/step;
        int[] result =new int[length];
        for (int i = 0; i < length; i++) {
            result[i]=start+(i* step);
        }
        return result;
    }
}
