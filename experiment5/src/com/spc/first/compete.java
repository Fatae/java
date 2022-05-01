package com.spc.first;
public class compete {
    public static void main(String[] args) throws InterruptedException {
        double v1=40+Math.random()*11;
        double v2=40+Math.random()*11;
        player player1 = new player(v1);
        player1.setName("player1");
        player player2 = new player(v2);
        player2.setName("player2");
        player1.start();
        player2.start();
        Thread.sleep(1000);
        if(v1>v2){
            System.out.println("player1获胜");
        }
        else if(v1<v2){
            System.out.println("player2获胜");
        }else{
            System.out.println("平局");
        }
    }
}
