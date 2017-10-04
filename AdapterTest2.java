package com.company.desgin;

class Source2{
    public void method1(){
        System.out.println("this is a origin method");
    }
}

interface Targetable2{
    public void method1();
    public void method2();
}

class Adapter2 implements Targetable{
    private Source source;
    public Adapter2(Source source){
        super();
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is a ter");
    }
}

public class AdapterTest2 {
    public static void main(String[] args) {
        Source source=new Source();
        Adapter2 adapter2=new Adapter2(source);
        adapter2.method1();
        adapter2.method2();
    }


}
