package com.spc.third;

public class Cat extends Animal implements pet {
    String name;

    public Cat(String name) {
        super("cat", 4);
        this.name = name;
    }

    public Cat(String type, int legs) {
        this(null);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "小猫的名字叫："+name;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    void eat() {
        System.out.println(name+" eating");
    }
}
