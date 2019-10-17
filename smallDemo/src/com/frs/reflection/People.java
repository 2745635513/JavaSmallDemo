package com.frs.reflection;

public class People {
    public String fatherName;
    public int fatherAge;

    public People(String name, Integer age) {
        this.fatherName = name;
        this.fatherAge = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
