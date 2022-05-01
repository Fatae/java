package com.spc.first;

public class player extends Thread{
    private double v;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始比赛");
        System.out.println(Thread.currentThread().getName()+"用时："+0.5/v+"小时");
    }

    public player(double v) {
        this.v = v;
    }
}
