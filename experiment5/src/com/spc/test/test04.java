package com.spc.test;

import java.io.*;

public class test04 {
    public static void main(String[] args) throws IOException {
        String path="D:\\spc.txt";
        InputStreamReader isr=new InputStreamReader(new FileInputStream(path),"utf8");
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\spc1.txt"),"gbk");
        osw.write(s);
        System.out.println("复制成功");
        osw.close();
        isr.close();
    }
}
