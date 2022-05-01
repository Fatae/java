package com.spc.Third;

public class pass {
    public static void main(String[] args) throws InterruptedException {
        torch torch01 = new torch();
        torch01.setName("罗致焕");
        torch torch02 = new torch();
        torch02.setName("景海鹏");
        torch torch03=new torch();
        torch03.setName("叶培建");
        torch01.start();
        Thread.sleep(1000);
        torch02.start();
        Thread.sleep(1000);
        torch03.start();
        Thread.sleep(1000);
        System.out.println("火炬传递完成");
    }
}
