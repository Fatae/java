package com.spc.test;

public class interrupt {
    public static void main(String[] args) throws InterruptedException {

        t t = new t();
        t.setName("spc");
        t.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("main线程执行");
        }
        t.interrupt();
    }
}
class t extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"study");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("休眠被中断");
            }
        }
    }
}