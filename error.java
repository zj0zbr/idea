package com.company.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class error {
    public static void main(String args[]) {
        error jt = new error();

        String s = "helloworld!";
        byte[] bt = null;
        bt = s.getBytes();
        ArrayList<String> list = new ArrayList<String>();
        list=jt.getArrayList(bt);//这一行会出错。
    }
    //注意这里，ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。
    // 问题就在这里，你是直接将byte[]数组传递过来，而这个byte数组不是使用ObjectOutputStream类写入的。
    // 所以问题解决的办法就是：用输出流得到byte[]数组。

    public ArrayList<String> getArrayList(byte[] bt) {
        ArrayList<String> list = new ArrayList<String>();
        ObjectInputStream objIps;
        try {
            objIps = new ObjectInputStream(new ByteArrayInputStream(bt));
            list = (ArrayList<String>)objIps.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public byte[] getByte(ArrayList<String> list) {
        byte[] bt=null;
        ByteArrayOutputStream baos=new ByteArrayOutputStream();

        try{
            if(list!=null)
            {
                ObjectOutputStream objos=new ObjectOutputStream(baos);
                objos.writeObject(list);
                bt=baos.toByteArray();
            }
        }catch(Exception e)
        {
            bt=(byte[])null;
            e.printStackTrace();

        }
        return bt;
    }


}