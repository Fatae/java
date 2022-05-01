package com.spc.test;

public class join_ {
    public static void main(String[] args) throws InterruptedException {
        T7 t2 = new T7();
        t2.setDaemon(true);
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("SSpc"+(i));
            Thread.sleep(1000);
//            if(i==5){
//            t2.join();
//            }
        }
    }
}
class T7 extends Thread{
    private int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("spc"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}