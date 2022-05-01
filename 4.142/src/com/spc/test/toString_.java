package com.spc.test;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

public class toString_ {
    public static void main(String arg[]){
        Integer[] integers={1,3,4,12};
        System.out.println(Arrays.toString(integers));
        LocalDateTime localDateTime =LocalDateTime.now();
    }
}
