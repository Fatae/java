package com.spc.first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        String pathname = "D:\\ShellExt\\奖牌金榜.txt";
        String read;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathname));
        while((read = bufferedReader.readLine())!=null){
            System.out.println(read);
        }
        bufferedReader.close();
    }
}
