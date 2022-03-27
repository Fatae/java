package com.spc.test;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        Person temp = null;
        Person[] person = new Person[3];
        person[0] = new Person("ja", 10, "a");
        person[1] = new Person("mak", 18, "2");
        person[2] = new Person("mary", 16, "s");
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].getName().length() < person[j + 1].getName().length()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
