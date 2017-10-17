package com.company.file.ii;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/zbr/opt/java/Hello/Student.txt");
        InputStream inputStream=new FileInputStream(file);
        byte[] bs=new byte[150];
        int hasread=0;
        while((hasread=inputStream.read(bs))>0){
            System.out.println(new String (bs,0,hasread,"utf-8"));
            System.out.println("你好");
        }
        inputStream.close();
    }
}