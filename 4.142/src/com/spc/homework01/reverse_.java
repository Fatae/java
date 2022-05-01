package com.spc.homework01;

public class reverse_ {
    public static String reverse(String str,int start,int end){
        char[] chars = str.toCharArray();
        char a;
        while(start<end){
        a=chars[start];
        chars[start]=chars[end];
        chars[end]=a;
        start++;
        end--;
        }
        return new String(chars);
    }
}
