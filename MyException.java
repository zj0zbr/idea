package com.company.language.Exception;

public class MyException extends Exception{
    private String name;
    public MyException(String name){
        this.name=name;
    }
}
