package com.spc.Collection.CollectionExercise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("ss", 11));
        list.add(new Dog("aa", 1));
        list.add(new Dog("s",2));
//        for (Object o :list) {
//            System.out.println(o);
//        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println(dog);
        }
    }
}
