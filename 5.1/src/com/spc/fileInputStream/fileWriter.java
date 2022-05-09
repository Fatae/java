package com.spc.fileInputStream;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        String path="d:\\sss.txt";
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write("马上该走了");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
