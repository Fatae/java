package com.spc.test;

import java.io.File;
import java.io.IOException;

public class fileCreate {
    public static void main(String[] args) {
//        File file = new File("d:\\", "new1.txt");
//        try {
//            file.createNewFile();
//            System.out.println("创建成功");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file = new File("d:\\new2.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File("d:\\");
        File file1 = new File(file, "new3.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.isDirectory());
    }
}
