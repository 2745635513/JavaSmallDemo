package com.frs.bio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        FileReader file1 = new FileReader("/FRS/javaDemo/index.txt");
        FileReader file2 = new FileReader("/FRS/javaDemo/index2.txt");
        FileWriter writer = new FileWriter("/FRS/javaDemo/content.txt");
        int temp;
        while ((temp=file1.read()) != -1) {
            writer.write(temp);
        }
        while ((temp=file2.read())!=-1){
            writer.write(temp);
        }
        file1.close();
        file2.close();
        writer.close();
    }
}
