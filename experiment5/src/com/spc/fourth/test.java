package com.spc.fourth;

public class test {
    public static void main(String[] args) {
        compete compete1 = new compete();
        compete1.setName("比赛1");
        compete compete2 = new compete();
        compete2.setName("比赛2");
        compete compete3 = new compete();
        compete3.setName("比赛3");
        compete1.start();
        compete2.start();
        compete3.start();
    }
}
