package com.spc.file_;

import java.io.File;
import java.io.IOException;

public class file_ {
    public static void main(String[] args) {
        File file = new File("d:\\spc.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists());
    }
}
