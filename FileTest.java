package com.company.file.i;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest {
    public void dis(){
        System.out.println("nihap");
    }
    public static void main(String[] args) throws IOException {
        File file=new File("/home/zbr/opt/java/Hello");
        System.out.println(file.isFile()+" "+file.isDirectory());
        if(!file.exists()){
            System.exit(1);
        }
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        tmpFile.deleteOnExit();


        File file1=new File("/home/zbr/opt/java/Hello");
        String[] filelist=file1.list();
        for (String filename : filelist){
            System.out.println(filename);
        }

//        showFile(file);
    }

//    public static void showFile(File f){
//        if(f.isDirectory()){
//            File[] l=f.listFiles();
//            for(File f1:l){
//                if(f1.isDirectory()){
//                    showFile(f1);
//                }else{
//                    System.out.println(f.getName());
//                }
//            }
//        }else{
//            System.out.println(f.getName());
//        }
//    }


    public void eat(){

    }



}
