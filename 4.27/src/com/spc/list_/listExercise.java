package com.spc.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add(1, "spc");
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.set(6,"7");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
