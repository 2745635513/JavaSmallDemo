package com.frs.clone;

import java.io.*;

public class SerializeClone implements Serializable {
    /**
     * 通过序列化实现数据的拷贝，深拷贝
     */
    public Cat cat;
    public SerializeClone copy(){
        SerializeClone clone=null;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objOut=new ObjectOutputStream(out);
            objOut.writeObject(this);

            ByteArrayInputStream in=new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objIn = new ObjectInputStream(in);
            clone =(SerializeClone) objIn.readObject();

            objIn.close();
            in.close();
            objOut.close();
            out.close();
        }catch (IOException i){
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
