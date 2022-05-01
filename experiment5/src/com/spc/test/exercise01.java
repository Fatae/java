package com.spc.test;

public class exercise01 {
    public static void main(String[] args) throws InterruptedException {
        s1 s1 = new s1();
        for (int i = 0; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
            if(i==5) {
                s1.start();
                s1.join();
            }
        }
    }
}
class s1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello"+i);
        }
    }
}