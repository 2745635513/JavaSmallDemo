package com.frs.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        pojo o = new pojo();
        o.name = "frace";
        o.age = 13;
        o.sex = "girl";
        o.address = "kaifeng";
        try {
            File file = new File("/FRS/temp");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOut = new FileOutputStream("/FRS/temp/pojo.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(o);
            objectOut.close();
            fileOut.close();
            System.out.println("serialize is saved !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
