package com.spc.third;

public class Animal {
    protected String type;
    protected int legs;
    public void eat(){

    }
    public void walk(){
        System.out.println("用"+legs+"条腿走路");
    }

    protected Animal(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }


}
