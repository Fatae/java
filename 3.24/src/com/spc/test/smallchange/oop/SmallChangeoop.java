package com.spc.test.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeoop {
    boolean flag = true;
    int a;
    double balance = 0;
    double money = 0;
    Date date = null;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String details = "===============零钱通明细===============";
    String note;
    public void menu(){
        do {
            System.out.println("\n=================菜单OOP==================");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");
            System.out.println("请选择(1-4)");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:

                   this.exit();
                    break;
            }
        } while (flag);
    }
    public void detail(){
        System.out.println("1.零钱通明细");
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        if(money<=0){
            System.out.println("收益应大于零");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n" + "收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }
    public void pay(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        if(money<=0||money>balance){
            System.out.println("消费金额应在1--"+balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t"
                + sdf.format(date) + "\t" + balance;
    }
    public void exit(){
        String judge;
        while (true) {
            System.out.println("是否退出，y/n");
            judge = scanner.next();
            if (judge.equals("y") || judge.equals("n"))
                break;
        }
        if (judge.equals("y")) {
            flag = false;
        }
    }
}
