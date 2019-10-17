package com.frs.reflection;


public class Test {
    public static void main(String[] args) {
//        Class oneClass= OnePerson.class;
////        System.out.println("类的完整名字: "+oneClass.getName());
////        System.out.println("类的名字"+oneClass.getSimpleName());
//        //获取所有变量
////        Field[] fields=oneClass.getFields();
//        Field[] fields=oneClass.getDeclaredFields();
//        for (Field item:fields){
//            //获取访问权限
//            int modifier=item.getModifiers();
//            System.out.println("访问权限"+Modifier.toString(modifier)+" ");
//
//            System.out.println("变量的类型和变量名"+item.getType().getName()+","+item.getName());
//    }
//        System.out.println(int.class.getName() +",,,,"+Integer.class.getName());
        String s1="12";
        String s2=new String("12");
//        System.out.println(s1.getClass()+" ,,, "+s2.getClass().getMethods());
        System.out.println(s1.getClass().isInstance("String"));//判断是否是string的实例
    }
}
