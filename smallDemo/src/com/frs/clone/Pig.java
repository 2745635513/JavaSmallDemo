package com.frs.clone;

public class Pig implements Cloneable {
    public String name;
    public Pig(String name){
        this.name=name;
    }
    public void printer(){
        System.out.println("pig`s name is "+name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
