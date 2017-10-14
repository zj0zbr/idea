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
//重写method2方法
    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
public class AdapterTest {
    public static void main(String[] args) {
        Targetable ta=new Adapter();
        ta.method1();//调用时直接调用 因为子类继承类父类
        ta.method2();//子类重写了method2方法
    }

}
