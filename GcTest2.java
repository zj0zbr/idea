package com.company.gc;


public class GcTest2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<3;i++){
            GcTest2 t2=new GcTest2();
            Thread.currentThread().sleep(1000);
//            System.gc();
        }
        //
        Runtime.getRuntime().gc();
    }


    public void finalize() {
        System.out.println("gc is running");
    }
}
