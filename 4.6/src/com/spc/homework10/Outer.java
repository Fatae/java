package com.spc.homework10;

public class Outer {
    int x = 7;
    public void print() {
        class Inner extends AbsDemo {
            @Override
            public void show() {
                System.out.println(x);
            }
        }
        AbsDemo abs = new AbsDemo() {
            @Override
            public void show() {
                System.out.println(x);
            }
        };
        new Inner().show();
        abs.show();
    }
}
