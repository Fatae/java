package com.spc.test;

public class test2 {
    public static void main(String[] args) {
        dog dog = new dog();
        Thread thread = new Thread(dog);
        thread.start();

    }
}
class dog implements Runnable{
    int count=0;
    @Override
    public void run() {
        while (true){
            System.out.println("cry"+(++count));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==10){
                break;
            }
        }
    }
}