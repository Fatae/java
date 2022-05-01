package com.spc.Third;

public class torch extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在传递火炬");
    }
}
