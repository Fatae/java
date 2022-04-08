package com.spc.homework05;

public class A {
    private String name="cc";
    public void f1(){
        class B{
            private final String name="spc";
            public void show(){
                System.out.println("name="+name);
                System.out.println("name="+A.this.name);
            }

        }
         new B().show();

    }
}
