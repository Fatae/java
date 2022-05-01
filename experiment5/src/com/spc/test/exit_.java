package com.spc.test;

public class exit_ {
    public static void main(String[] args) {
        t1 t1 = new t1();
        t1.start();
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setLoop(false);
    }
}
class t1 extends Thread{
    private boolean loop=true;
    private int num=0;
    @Override
    public void run() {
        while (loop){
            System.out.println(++num);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
