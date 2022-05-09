package com.spc.first;

public class player extends Thread {
    private int v;
    private int t = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始比赛");
        while (v * t < 500) {
            System.out.println(Thread.currentThread().getName() + "已经走了" + v * t + "m"
                    + "还剩" + (500 - v * t) + "m");
            t++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public player(int v) {
        this.v = v;
    }
}
