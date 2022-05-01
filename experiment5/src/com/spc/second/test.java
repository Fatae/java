package com.spc.second;

public class test {
    public static void main(String[] args) throws InterruptedException {
        rest rest = new rest();
        competition competition = new competition();
        rest.start();
        rest.join();
        competition.start();
    }
}
