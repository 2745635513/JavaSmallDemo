package com.frs.clone;

public class SmallTest {
    public static void main(String[] args) {
        /**
         * 赋值传递
         */
        int[] num = {1, 3, 5, 6};
        int[] numCopy = num;//复制引用
//        numCopy[2] = 3;
        num[2] = 7;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");


        }
        System.out.println();
        for (int i = 0; i < numCopy.length; i++) {
            System.out.print(numCopy[i] + " ");
        }
    }
}
