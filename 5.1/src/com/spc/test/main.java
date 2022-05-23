package com.spc.test;
public class main {
    public static void main(String[] args) {
        test02 test02 = new test02(1);
        test02 test03 = new test02(2);
        Thread thread = new Thread(test02);
        thread.setName("小猫");
        Thread thread1 = new Thread(test03);
        thread1.setName("兔子");
              thread.start();
              thread1.start();
    }
}
