package com.company.reflaction.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DProx2 {
    public static void main(String[] args) throws Exception{
        teach t=new Learcher();

        Myprox m=new Myprox();
        m.setT1(t);
        teach t2=(teach) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(),m);
        t2.Read();
        t2.writen();
    }
}

interface teach{
    public void writen();

    public void Read();
}



class Teacher implements teach{
    @Override
    public void writen() {
        System.out.println("大学 统招教书");
    }

    @Override
    public void Read() {

    }
}

class  Learcher implements teach{
    @Override
    public void writen() {
        System.out.println("社会叫我成长");
    }

    @Override
    public void Read() {

    }
}

class Myprox implements InvocationHandler{
    private Object target;

    public void setT1(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object test=method.invoke(target,args);

        return test;
    }
}