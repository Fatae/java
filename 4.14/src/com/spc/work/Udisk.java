package com.spc.work;

public class Udisk implements USB{
    @Override
    public void start() {
        System.out.println("u盘已插上可以读写");
    }

    @Override
    public void stop() {
        System.out.println("u盘已拔掉无法读写");
    }
}
