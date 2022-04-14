package com.spc.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        int n1=100;
        Integer integer = new Integer(n1);//手动装箱
        Integer integer1 = Integer.valueOf(n1);//手动装箱
        //手动拆箱
        int i=integer.intValue();
        //jdk5以后
        //自动装箱，拆箱
        Integer integer2=n1;
        int n3=integer2;
        Object obj=true?new Integer(1):new Double(2.0);
        //三元运算符是一个整体
        System.out.println(obj);
        System.out.println();
            }
}
