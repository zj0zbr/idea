package com.company.classloder.classloderindex;

public class Person {
    public int a=0;
    public static int b=2;

    //加载过程为先加载
    Person(){
        System.out.println("构造方法");
    }

    static {
        System.out.println("静态块");
    }

    public void run(){
        System.out.println(b);
    }

    public static void main(String[] args) {

        Person p=new Person();
        p.run();
//        p.a=0;
        System.out.println(p.a);

    }
}


class Student{

}