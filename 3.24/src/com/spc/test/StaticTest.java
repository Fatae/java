package com.spc.test;

class StaticTest{
    static{
        System.out.print("a ");
    }
    static{
        System.out.print("b ");
    }
    public static void main(String[] args) {
        StaticTest st1 = new ChildTest();
    }
}

class ChildTest extends StaticTest{
    static{
        System.out.print("c ");
    }
}