package com.company.gc;

public class GcTest {
    int a;

    public static void main(String[] args) {

        int i=0;

        System.out.println(i++);
        int a=0;
        System.out.println(++a);
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println("create"+s2);
        System.out.println("create"+s3);
        s2=s3=null;
        System.out.println(s2+" "+s3);

        //调用System.gc()实际上等同于调用Runtime.getRuntime.gc()
        //告诉垃圾回收器进行垃圾回收 而垃圾回收器回收的时间不确定
        System.gc();
        Runtime.getRuntime().gc();

        //尽量执行finalize方法
        Runtime.getRuntime().runFinalization();

        System.out.println(s1 +" "+s2+" "+s3);


    }
}

class Student{
    //局部变量会初始化变量
    int age;
    String name;
    public void run(){
        System.out.println("学生类："+"名字："+name+"年龄："+age);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
    }
}