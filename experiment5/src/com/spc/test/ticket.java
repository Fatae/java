package com.spc.test;

public class ticket {
    public static void main(String[] args) {
        sellTicket sellTicket = new sellTicket();
        sellTicket sellTicket1 = new sellTicket();
        sellTicket sellTicket2 = new sellTicket();
        sellTicket.start();
        sellTicket1.start();
        sellTicket2.start();
//        sellTicket1 sellTicket1 = new sellTicket1();
//        Thread thread = new Thread(sellTicket1);
//        Thread thread1 = new Thread(sellTicket1);
//        Thread thread2 = new Thread(sellTicket1);
//        thread.start();
//        thread1.start();
//        thread2.start();

    }
}

class sellTicket extends Thread {
    private static int num = 1000 ;
    private static boolean loop = true;

    public static synchronized void sell() {

        if (num <= 0) {
            System.out.println("售票结束");
            loop = false;
            return;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"票数剩余" + (--num));
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}


//class sellTicket1 implements Runnable {
//    private  int num=100;
//    @Override
//    public void run() {
//        while(true){
//            if(num<=0){
//                System.out.println("售票结束");
//                break;
//            }
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("票数剩余"+(--num));
//        }
//    }
//}