package com.spc.third;

public class test {
    public static void main(String[] args) {
        Spider spider=new Spider();
        spider.walk();
        Cat cat = new Cat("Kitty");
        System.out.println(cat.getName());
        cat.walk();
        cat.play();
        cat.eat();
    }
}
