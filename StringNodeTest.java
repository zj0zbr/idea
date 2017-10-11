package com.company.file.iii;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
    public static void main(String[] args) throws IOException {
        String str="好好学习,\n天天向上。\n";
        char[] buf=new char[32];
        StringReader sr=new StringReader(str);
        int hasread=0;
        while ((hasread=sr.read(buf))>0){
            System.out.print(new String(buf,0,hasread));
        }
        StringWriter sw=new StringWriter();
        sw.write("我要努力向上\n");
        sw.write("争取挣大钱\n");
        System.out.println("--------kaishi-----");
        System.out.println(sw.toString());
        sr.close();
        sw.close();
    }
}
