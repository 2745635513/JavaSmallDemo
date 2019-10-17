package com.frs.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class PrinterMethods {
    public static void main(String[] args) {
        Class oneClass=OnePerson.class;

        Method[] methods=oneClass.getMethods();

        for (Method method:
             methods) {
            System.out.println();
            int modifier=method.getModifiers();
            System.out.print("访问权限： "+ Modifier.toString(modifier) +" ");
            System.out.print(" 方法类型和名字："+ method.getReturnType().getSimpleName()+"  "+method.getName() +"(");
            Parameter[] parameters=method.getParameters();
            for (Parameter parameter:
                 parameters) {
                System.out.print(" "+parameter.getType().getSimpleName()+" "+parameter.getName());
            }
            if (method.getExceptionTypes().length==0){
                System.out.print(" ) ");
            }else {
                for (Class c : method.getExceptionTypes()){
                    System.out.print(" ) throws "+c.getName());
                }
            }

        }
    }
}
