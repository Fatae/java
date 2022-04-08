package com.spc.homework04;

public class test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new counter() {
            @Override
            public double work(double n, double m) {

                return m*n;
            }
        },10,10);
    }
}
