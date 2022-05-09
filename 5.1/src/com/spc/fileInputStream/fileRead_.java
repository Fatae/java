package com.spc.fileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead_ {
    public static void main(String[] args) {
        String path="d:\\spc.txt";
        FileReader fileReader=null;
        try {
            int read=0;
            char[] bytes=new char[8];
            fileReader = new FileReader(path);
//            while ((read=fileReader.read())!=-1){
//                System.out.print((char) read);
//            }
            while ((read=fileReader.read(bytes))!=-1){
                System.out.print(new String(bytes,0,read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
