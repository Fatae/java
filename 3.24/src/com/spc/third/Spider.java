package com.spc.third;

public class Spider extends Animal{
    public Spider(String type, int legs) {
        super(type, 8);
    }

    public void eat(){
        System.out.println("spider eating");
    }
}
