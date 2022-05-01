package com.spc.fourth;

public class compete extends Thread {
    private static int num = 1000;

    @Override
    public void run() {
        while (true) {
            water();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized static void water() {
        num -= 20;
        System.out.println(Thread.currentThread().getName() + "拿走20瓶水,还剩下"
                + (num) + "瓶水");
        if (num < 100) {
            new passWater().start();
        }
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        compete.num = num;
    }
}
