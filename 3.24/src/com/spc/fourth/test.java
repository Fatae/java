package com.spc.fourth;

public class test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder.Circle circle = new Cylinder.Circle();
        System.out.println(cylinder.bulk(10,circle.area(2)));
        System.out.println(cylinder.bulk(1,circle.area(1.3)));

    }
}
