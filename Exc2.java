package com.company.language.Exception;

public class Exc2 {
    static void demoproc() throws MyException {
        try{
            throw new MyException("demo");
        }catch (MyException e){
            System.out.println("乱七八遭My");
            throw e;
        }
    }

    public static void main(String[] args){
        try{
            demoproc();
        }catch (MyException e) {
            System.out.println("抓住："+e);
        }
    }
}
