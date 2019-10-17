package com.frs.serializable;

import java.io.Serializable;

public class pojo implements Serializable {
    public String name;
    public Integer age;
    public transient String sex;
    public String address;
    public void printer(){
        System.out.println("hello " +name +" ");
    }
}
