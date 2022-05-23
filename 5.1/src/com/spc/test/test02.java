package com.spc.test;
public class test02 implements Runnable{
    public static int a=100;
    public int num;
    @Override
    public void run() {
        while(true){
            drink();
            if(a<=0){
                break;
            }
        }
    }
public synchronized void drink(){
        a=a-num;
        if(a<0){
            return;
        }
    System.out.println(Thread.currentThread().getName()+"喝了"+num+"口水,还剩"+a+"口水");
}
    public test02(int num) {
        this.num = num;
    }
}
