package com.frs.clone;

import java.io.Serializable;

public class Cat implements Serializable {
    public String name = "";

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + "]";
    }

}
