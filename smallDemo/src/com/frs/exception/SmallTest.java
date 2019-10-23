package com.frs.exception;

public class SmallTest {
    static int test() {
        int i = 1;
        try {
            System.out.println("try i:"+i);
            i=i/0;
            return ++i;
        } catch (Exception e) {
            System.out.println("catch i :"+i);
            return ++i;
        } finally {
            System.out.println("finally i :"+i);
            ++i;
            System.out.println("finally ++i: "+i);
//            return ++i;
        }
    }

    public static void main(String[] args) {
//        try {
//            throw new Exception("抛出异常处");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("最终执行的地方");
//        }

//        String str=null;
//        try {
//            if (str==null) throw new Exception("str == null");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        int[] arr={1,2,3};
//        try {
//            System.out.println(arr[-1]);
//        }catch (ArrayIndexOutOfBoundsException a){
//            System.out.println(a.getMessage());
//        }

        System.out.println("i-->" + test());
    }
}
