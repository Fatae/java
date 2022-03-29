package com.spc.Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.next();
        String c=a.substring(1,a.length()-1);//返回字符串包括开头不包括结尾
        String[] b=c.split(",");//split字符串分割为字符串数组
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        int length=b.length;
        int num=((0+length)*(length+1))/2;
        for (int i = 0; i < length; i++) {
            num=num-Integer.parseInt(b[i]);
        }
        System.out.println(num);
    }
}
