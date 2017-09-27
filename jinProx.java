package com.company.reflaction.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

interface Login {
    public void login();
}

class Userinfo implements Login{

    @Override
    public void login() {
        System.out.println("要进行登录操作");
    }
}

class ProxUser implements Login{
    private Userinfo u;

    public ProxUser(Userinfo userinfo){
        this.u=userinfo;
    }

    @Override
    public void login() {
        System.out.println("输入验证码");
        u.login();
        System.out.println("登出");
    }
}

public class jinProx{
    public static void main(String[] args) {
        Userinfo u=new Userinfo();
        ProxUser pu=new ProxUser(u);
        pu.login();
    }
}