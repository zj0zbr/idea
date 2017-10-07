package com.company.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjest {
    public static void main(String[] args) {
        try{
            File file=new File("/home/zbr/opt/java/Hello/Student.txt");
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(file));
             System.out.println(ois.available());
            ois.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
