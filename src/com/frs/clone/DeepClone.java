package com.frs.clone;

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //方法一：实现cloneable接口，重写父类方法，调用父类clone方法
        Pig pig = new Pig("lainCarl");
        pig.printer();
        Pig pig1 = (Pig) pig.clone();
        pig1.name="frace";
        pig.printer();
        System.out.println((pig == pig1 ? "是" : "不是") + "浅拷贝");
        //方法二：使用序列化实现
        SerializeClone serializeClone = new SerializeClone();
        serializeClone.cat=new Cat("fraceCat");
        System.out.println(serializeClone.cat.toString());
        SerializeClone serializeCloneCopy =serializeClone.copy();
        System.out.println(serializeCloneCopy.cat.toString());
        if (serializeCloneCopy!=null){
            serializeCloneCopy.cat.name="fraceCatNo2";
            System.out.println("克隆后的修改，原数据 " +serializeClone.cat.toString());
            System.out.println("克隆后的修改，克隆数据 "+serializeCloneCopy.cat.toString());
        }
    }
}
