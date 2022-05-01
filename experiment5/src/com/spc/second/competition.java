package com.spc.second;

public class competition extends Thread{
    @Override
    public void run() {
        System.out.println("开始比赛,时间20分钟");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
