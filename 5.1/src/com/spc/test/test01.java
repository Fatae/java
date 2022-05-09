package com.spc.test;

import java.io.File;

public class test01 {
    public static void main(String[] args) {
        String path="d:\\demo\\a\\b\\c";
        File file = new File(path);
        if(file.exists()){
            System.out.println("文件已经存在");
        }else {
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
    }
}
