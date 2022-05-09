package com.spc.fileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) {
        String path="d:\\spc.txt";
        String s="Hello,world";
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream(path,true);
            fileOutputStream.write(s.getBytes(),0,5);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
