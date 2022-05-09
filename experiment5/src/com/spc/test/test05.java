package com.spc.test;

import java.io.*;

public class test05 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\spc2.txt");
        double[] a = {90, 85.5, 100, 88, 79};
        OutputStream os = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(os);
        dataOutputStream.writeUTF("我是软件工程21-03班级的宋培川，我的学号是542113460332，我预想我这学期的考试课成绩如下：");
        for (int i = 0; i < a.length; i++) {
            dataOutputStream.writeDouble(a[i]);
        }

        File file1 = new File("D:\\spc2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        String date=null;

            System.out.println(dataInputStream.readUTF());
        for (int i = 0; i < a.length; i++) {
            System.out.print(dataInputStream.readDouble()+" ");
        }

        dataInputStream.close();
        dataOutputStream.close();
        os.close();

    }
}
