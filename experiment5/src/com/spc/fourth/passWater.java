package com.spc.fourth;

public class passWater extends Thread{
    @Override
    public void run() {
        if (compete.getNum() < 100) {
            compete.setNum(1000);
            System.out.println("保障队送水成功，现有水1000瓶");
        }
    }
}
