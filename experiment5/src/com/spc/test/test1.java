package com.spc.test;

public class test1 {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class cat extends Thread{
    int time=0;

    @Override
    public void run() {
        while(true){
        System.out.println("spc"+(++time));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(time==10){
            break;
        }
    }
    }
}
