package com.spc.fourth;

public class test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder.Circle circle = cylinder.new Circle();
        System.out.println("体积为："+cylinder.bulk(10, circle.area(2)));
        System.out.println("体积为："+cylinder.bulk(1,circle.area(1.3)));
    }
}
