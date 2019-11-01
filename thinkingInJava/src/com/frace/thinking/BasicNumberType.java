package com.frace.thinking;

/**
 * Created by frace on 2019/10/30 14:45
 */

/**
 * 这是 ：java的基本数据类型的类
 * 基本数据类型，整型，浮点型，布尔型，字符类
 */
public class BasicNumberType {
    static byte b;
    static int i;
    static short s;
    static long l;
    static char c;
    static float f;
    static double d;
    static boolean aBoolean;
    int outInt;
    public void innerMethod(){
        System.out.println(outInt);
//        int innerInt;
//        System.out.println(innerInt);//如果没有给局部变量初始化，直接使用是会报错的
    }
    public static void main(String[] args) {
        //byte 大小：8位=1字节
        System.out.println("byte 的默认值："+b+" byte 的值范围："+Byte.MIN_VALUE+"   "+Byte.MAX_VALUE);// 0 -2^7   2^7-1
        //short 大小：16位=2字节
        System.out.println("short 的默认值："+s+" 值范围："+Short.MIN_VALUE+" "+Short.MAX_VALUE);
        //int 大小：32位=4字节
        System.out.println("int 的默认值："+i+" int 的值的范围："+Integer.MIN_VALUE +"    "+Integer.MAX_VALUE);//0 -2^31    2^31-1
        //long 大小：64位=8字节
        System.out.println("long 的默认值："+l+" long 的值范围："+Long.MIN_VALUE+""+Long.MAX_VALUE);
        //char 大小：16位=2字节
        System.out.println("char 的默认值："+c+" char的int值范围："+(int)Character.MIN_VALUE+" "+(int)Character.MAX_VALUE);//空 int:0 65536
        //float 大小： 32位=4字节
        System.out.println("float 的默认值："+f +" float的int值范围："+Float.MIN_EXPONENT+" "+Float.MAX_EXPONENT );//0.0 int :-126  127
        //double 大小： 64位=8字节
        System.out.println("double 的默认值："+d +" double的值范围："+Double.MIN_EXPONENT+" "+Double.MAX_EXPONENT );//0.0 int:-1022 1023
        //Boolean 只有真假，默认是false
        System.out.println("Boolean 的默认值："+aBoolean );
        BasicNumberType basicNumberType=new BasicNumberType();
        basicNumberType.printer();

        char c1='中';
//        char c2='中国';//这是会报错的，因为char只有2字节，java：双字节编码，utf-16be，中英文都是占用两个字节（2，2）
        System.out.println(c1+","+((int)c1));

    }
    public void printer(){
        int i=2;
        System.out.println("当前方法的"+i+"当前类的i："+this.i);
    }
}
