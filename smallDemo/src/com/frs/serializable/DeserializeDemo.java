package com.frs.serializable;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        pojo o=null;
        try {
            FileInputStream fileIn= new FileInputStream("/FRS/temp/pojo.ser");
            ObjectInputStream ojectIn = new ObjectInputStream(fileIn);
            try {
                o=(pojo) ojectIn.readObject();
                ojectIn.close();
                fileIn.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("read is over.");
            System.out.println(o.name);
            System.out.println(o.sex);
            System.out.println(o.address);
            System.out.println(o.age);
            o.printer();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
