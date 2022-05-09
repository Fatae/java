package com.spc.third;

import java.io.File;

public class judge {
    public void delete(String testFileDir) {
        File[] testFile = new File(testFileDir).listFiles();
        for (int i = 0; i < testFile.length; i++) {
            if (testFile[i].isFile()) {
                testFile[i].delete();
            } else if (testFile[i].isDirectory()) {
                delete(testFile[i].getPath());
            } else {
                System.out.println("文件读入有误！");
            }
        }
    }
}

