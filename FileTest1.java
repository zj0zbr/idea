package com.company.file.i;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

    public static void main(String[] args) throws IOException {
/*
        //创建文件
        File file=new File("/home/zbr/opt/2017.10.15");
        System.out.println("file是否是文件"+file.isFile());
        file.createNewFile();//创建文件
        System.out.println("+file是否是文件"+file.isFile());
        System.out.println("得到file的绝对路径名形式"+file.getAbsoluteFile());
        System.out.println("得到file的绝对路径名字符串"+file.getAbsolutePath());
        System.out.println("得到file的所在目录结构"+file.getParent());
        System.out.println("得到file的文件名"+file.getName());
*/

/*
        //创建目录
        File directory=new File("/home/zbr/opt/2017.10.17");
        System.out.println("directory是否是目录"+directory.isDirectory());
        //mkdirs()方法创建目录时，如果待创建目录的上几级目录不存在则一并创建，mkdir()则只能创建单级目录
        directory.mkdir();//创建目录
        File directory1=new File("")
        System.out.println("+directory是否是目录"+directory.isDirectory());

        //创建已创建目录下的文件或目录
        File temp=new File(directory,"name");//name即创建本文件或目录名
        System.out.println("创建之前"+temp.exists());
        temp.createNewFile();//创建文件
        temp.mkdir();//创建目录
        System.out.println("创建之后"+temp.exists());
        System.out.println(temp.isFile());
*/

/*
        //指定前缀后缀生成文件
        File txt=File.createTempFile("First",".txt");
        System.out.println(txt.exists());
        System.out.println(txt.isFile());
        System.out.println(txt.getParent());
        txt.delete();
        System.out.println(txt.isFile());
*/

/*
        //列出当前路径下所有文和路径
        File file3=new File("/home/zbr/opt");
        String[] filelist=file3.list();
        for(String filename:filelist){
            System.out.println(filename);
        }
*/

        File[] roots=File.listRoots();
        for (File root:roots){
            System.out.println(root);
        }
    }
}
