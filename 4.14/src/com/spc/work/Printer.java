package com.spc.work;

public class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机已连接可以打印");
    }

    @Override
    public void stop() {
        System.out.println("打印机已关闭无法打印");
    }
}
