package com.spc.first;
public class compete {
    public static void main(String[] args) throws InterruptedException {
        int v1=(int)(40+Math.random()*11);
        int v2=(int)(40+Math.random()*11);
        player player1 = new player(v1);
        player1.setName("player1");
        player player2 = new player(v2);
        player2.setName("player2");
        player1.start();
        player2.start();
        Thread.sleep(1000);
        judge judge = new judge(v1, v2);
        judge.setName("裁判员");
        judge.start();
    }
}
