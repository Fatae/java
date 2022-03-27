package com.spc.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a=scanner.next();
        String b=scanner.next();


        if(a.equalsIgnoreCase(b)){
            System.out.println("True");
        }else
            System.out.println("False");

    }
}
