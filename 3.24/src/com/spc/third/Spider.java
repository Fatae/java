package com.spc.third;

public class Spider extends Animal{
    public Spider() {
        super("spider",8);
    }


    @Override
    void eat() {
        System.out.println("spider eating");
    }
}
