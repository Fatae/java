package com.spc.second;

public class rest extends Thread{
    @Override
    public void run() {
        System.out.println("中场休息15分钟");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始下局比赛");
    }
}
