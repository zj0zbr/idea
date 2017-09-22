package com.company.classloder.active;

//编译器会按顺序加载收集变量
public class Clinit {
    private int j;

    public Clinit(){
        this.j=3;
        System.out.println(j);
    }

    static int i=1;//正确的静态语句赋值方法
    static {
        i=0;
        System.out.println(i);
    }

    //static int i=1;    这样编译器会提示 非法向前引用

    public static void main(String[] args) {
        Client2 c2=new Client2();

    }
}

class Client2 extends Clinit{
    private int m;

    public Client2(){
        this.m=4;
        System.out.println(m);
    }

    static {
        int n=2;
        System.out.println(n);
    }
}