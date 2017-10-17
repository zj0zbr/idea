package com.company.file.ii;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/zbr/opt/java/Hello/Student.txt");
        BufferedReader br=new BufferedReader(fr);
        String str=new String();

        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        fr.close();
    }
}
