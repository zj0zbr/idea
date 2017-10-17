package com.company.file.ii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fs=new FileInputStream("/home/zbr/opt/java/Hello/Hello.java");
        FileOutputStream fo=new FileOutputStream("/home/zbr/opt/newFile.txt",true);
        byte[] bs=new byte[32];
        int hasread=0;
        while ((hasread=fs.read(bs))>0){
            fo.write(bs,0,hasread);
        }
        fo.close();
        fs.close();
    }
}
