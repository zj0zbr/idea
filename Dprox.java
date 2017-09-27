package com.company.reflaction.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dprox {
    public static void main(String[] args) {
        Writen w=new Student();

        Myinvoke m=new Myinvoke();
        m.setTarget(w);
        Writen s2=(Writen) Proxy.newProxyInstance(w.getClass().getClassLoader(),w.getClass().getInterfaces(),m);
        s2.dosome();
    }
}

interface Writen{
    public void dosome();
}


class Student implements Writen{

    @Override
    public void dosome() {
        System.out.println("写一些东西");
    }
}

class Myinvoke implements InvocationHandler{
    private Object target;

    public void setTarget(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先读东西");

        Object result=method.invoke(target,args);
        System.out.println("结束");
        return result;
    }
}