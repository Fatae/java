package com.spc.third;

public abstract class Animal {
    protected String type;
    protected int legs;
    protected Animal(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }
    abstract void eat();
    public  void walk(){
        System.out.println(type+"用"+legs+"条腿走路");
    }


}
