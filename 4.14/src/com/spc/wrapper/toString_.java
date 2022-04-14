package com.spc.wrapper;

public class toString_ {
    public static void main(String[] args) {
        Integer i=100;
        //包装类转成String
        String str1=i + "";
        String str2=i.toString();
        String str3=String.valueOf(i);
        //String转成包装类
        String str4="1234";
        Integer i2=Integer.parseInt(str4);
        Integer i3=new Integer(str4);
    }
}
