package com.spc.Directory_;

import java.io.File;

public class delete_ {
    public static void main(String[] args) {
        File file = new File("d:\\spc");
        if(file.exists()){
            System.out.println("目录存在");
        }else {
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
if(file.delete()){
    System.out.println("victory");
}
    }
}
