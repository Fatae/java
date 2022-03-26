package com.spc.encap;

import java.sql.SQLOutput;

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        setBalance(balance);
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4)
        this.name = name;
        else
        {
            System.out.println("名字长度需在2到4位之间");
            this.name="spc";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>20){
        this.balance = balance;
        }
        else{
            System.out.println("余额不足20");
            this.balance=-1;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6) {
            this.password = password;
        }
        else{
            System.out.println("密码需要六位");
            this.password="123456";
        }
    }
    public String print(){
return "name="+name+"\t"+"余额="+balance+"\t"+"密码="
        +password;
    }
}
