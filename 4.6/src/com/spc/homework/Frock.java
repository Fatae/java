package com.spc.homework;

public class Frock {
    private static int currentNum=100000-100;
    public static int getNextNum(){
        return currentNum+=100;
    }
   int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber=getNextNum();
    }
}
