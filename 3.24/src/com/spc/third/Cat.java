package com.spc.third;

public class Cat extends Animal{
    String name;

    public Cat(String type, int legs, String name) {
        super("cat", 4);
        this.name = name;
    }

    public Cat() {
        this("null",4,"null");
    }
}
