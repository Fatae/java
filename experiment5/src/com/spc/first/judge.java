package com.spc.first;

public class judge extends Thread {
    private int v1;
    private int v2;

    @Override
    public void run() {
        if(v1>v2){
            System.out.println(Thread.currentThread().getName()+"宣布player1获胜");
        }
        else if(v1<v2){
            System.out.println(Thread.currentThread().getName()+"宣布player2获胜");
        }else{
            System.out.println(Thread.currentThread().getName()+"宣布平局");
        }
    }

    public judge(int v1,int v2){
        this.v1=v1;
        this.v2=v2;
    }


}


