package com.spc.work;
import java.util.Scanner;
public class Computer {
    public static void main(String[] arg) {
        Computer computer = new Computer();
        System.out.println("请输入所使用的设备");
        System.out.println("1.U盘2.打印机");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                computer.operate(new Udisk());
                break;
            case 2:
                computer.operate(new Printer());
        }
    }
    public void operate(USB usb) {
        usb.start();
        usb.stop();
    }
}
