package com.spc.first;

import java.io.*;
import java.util.ArrayList;

public class first {
    public static void main(String arg[]) throws IOException {
        String path = "D:\\ShellExt\\奖牌金榜.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));
        bufferedWriter.newLine();
        bufferedWriter.write("澳大利亚，1，2，1，4");
         bufferedWriter.newLine();
        bufferedWriter.write("英国，1，1，0，2");
        bufferedWriter.newLine();
        bufferedWriter.write("匈牙利，1，0，2，3");
        bufferedWriter.newLine();
        bufferedWriter.write("比利时，1，0，1，2");
        bufferedWriter.newLine();
        bufferedWriter.write("捷克，1，0，1，2");
        bufferedWriter.newLine();
        bufferedWriter.write("斯洛伐克，1，0，1，2");
        bufferedWriter.newLine();
        bufferedWriter.write("白俄罗斯，0，2，0，2");
        bufferedWriter.newLine();
        bufferedWriter.write("西班牙，0，1，0，1");
        bufferedWriter.newLine();
        bufferedWriter.write("乌克兰，0，1，0，1");
        bufferedWriter.newLine();
        bufferedWriter.write("爱沙尼亚，0，0，1，1");
        bufferedWriter.newLine();
        bufferedWriter.write("拉脱维亚，0，0，1，1");
        bufferedWriter.newLine();
        bufferedWriter.write("波兰，0，0，1，1");
        bufferedWriter.newLine();

        bufferedWriter.close();


        }
    }






