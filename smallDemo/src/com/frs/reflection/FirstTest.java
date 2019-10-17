package com.frs.reflection;

public class FirstTest {
    public static void main(String[] args) {
        //方式一获得class对象
        Boolean flag=true;
        Class<?> classType=flag.getClass();
        System.out.println("Object.getClass() "+classType);
        //
        Class<?> classType2=Boolean.class;
        System.out.println("Boolean.class "+classType2);
        //
        try {
            System.out.println("Class.forName "+ Class.forName("java.lang.Boolean") );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //
        System.out.println("type:"+Boolean.TYPE);
    }
}
