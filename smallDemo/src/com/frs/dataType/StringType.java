package com.frs.dataType;

/**
 * 这是一个string的类
 * String用来定义一个字符串，字符串是常量，它们的值在创建之后不可修改
 */
public class StringType {
    public static void main(String[] args) {
        /**
         * 初始化两种
         */
//        String str1="abc";//初始化一
//        String str2= new String("abc");//初始化二
        /**
         * equal()：判断比较的内容是否相同
         * ==：比较的是地址
         */
        System.out.println( "java 和 Java equals吗？ 结果是："+("java".equals("Java")));//结果：false
        System.out.println("java 和 Java equalsIgnoreCase吗？ 结果是："+("java".equalsIgnoreCase("Java")));//大小写忽略；结果：true
        String str1="A1";
        String str2=str1.concat("s2");
        String str3="s3";
        String str4=str3.concat(str2);
        System.out.println(str4);//输出：s3s1s2
        System.out.println("charAt():"+str3.charAt(1));//:3
        System.out.println("indexOf(int):"+str4.indexOf(65)+",indexOf(String)"+str4.indexOf("s"));//:2,0
        String str5=" \ta d\t ";
        System.out.println("trim():"+str5.trim()+",replace:"+str5.replaceAll("\\s*|\t",""));
        String str6="123";
        System.out.println("subString():"+str6.substring(0,0));
        System.out.println("instanceof:"+str6 instanceof Object);
        /**
         *  中文的长度
         */
        String str="Java 你好";
        System.out.println(str.length());// 输出：7
    }
}
