package com.spc.first;

import java.io.*;

public class order {
    public static void main(String[] args) throws  IOException {
        String pathname = "D:\\ShellExt\\奖牌金榜.txt";
        String pathname01 = "D:\\ShellExt\\奖牌金榜.txt";
        String read;
        String str[] = new String[30];


        FileReader fileReader = new FileReader(pathname);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i = 0;
        while((read = bufferedReader.readLine())!=null) {
            str[i] = read;
            i++;
        }


        String str01[] = new String[29];
        for(int a=0;a<29;a++){
            str01[a] = str[a+1];
        }



        String str02[] = new String[29] ;
        for(int c=0; c<28;c++) {//一行一行的读
            String[] s1 = str01[c].split("，");
            str02[c]= s1[s1.length-1];
        }

        int str03[] = new int[29];
        for(int d=0;d<28;d++){
            str03[d] = Integer.parseInt(str02[d]);//Integer.parseInt（）这个方法将字符串转化成整数，存到新整数数组str03[]
        }
        //实现数组从大到小排序，将整数数组和字符串实现一起排序
        for(int e=0;e< str03.length-1;e++) {//用冒泡排序实现
            for (int f = 0; f < str03.length - 1; f++) {
                if (str03[f] < str03[f + 1]) {
                    //实现数组排序
                    //冒泡排序可以使数组元素从大到小，整数数组元素换位置，str01[]数组也换，同一个f，
                    //整数数组排好后，字符数组也跟着排好了
                    int num = 0;
                    num = str03[f];
                    str03[f] = str03[f + 1];
                    str03[f + 1] = num;
                    //实现字符数组排序：通过关联整数数组
                    String read01;
                    read01 = str01[f];
                    str01[f] = str01[f + 1];
                    str01[f + 1] = read01;
                }
            }
        }
        // System.out.println("===========将实现金牌榜从大到小
        // 排序好的字符串数组写入文件");
        FileWriter fileWriter = new FileWriter(pathname01);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(int h=0;h<28;h++) {
            bufferedWriter.write(str01[h]);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

