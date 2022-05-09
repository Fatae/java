package com.spc.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) {
        String path="d:\\1.jpg";
        String dpath="d:\\2.jpg";
//        int read=0;
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream= new FileInputStream(path);
            fileOutputStream= new FileOutputStream(dpath);
            byte[] bytes=new byte[1024];
            int read=0;
            while ((read=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,read);

            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
