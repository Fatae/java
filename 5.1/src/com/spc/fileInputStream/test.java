package com.spc.fileInputStream;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        String path = "d:\\new1.txt";
        int readDate=0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            while ((readDate=fileInputStream.read()) != -1) {
                System.out.print((char)readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
