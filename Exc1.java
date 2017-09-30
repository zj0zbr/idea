package com.company.language.Exception;

public class Exc1 {
    public static void main(String[] args) {
        int a,b,c;
        try{
            a=12;
            b=0;
            c=a/b;
            System.out.println("这句不会输出的");
        }catch (Exception e){
            System.out.println("除数为零");
        }
        System.out.println("接下来");
    }


}
