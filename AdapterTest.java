package com.company.desgin;

class Source{
    public void method1(){
        System.out.println("this is a origin method");
    }
}

interface Targetable{
    public void method1();

    public void method2();
}


class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
public class AdapterTest {
    public static void main(String[] args) {
        Targetable ta=new Adapter();
        ta.method1();
        ta.method2();
    }

}
