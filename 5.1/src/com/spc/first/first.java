package com.spc.first;

import java.io.*;
import java.util.ArrayList;

public class first {
    public static void main(String arg[]) throws IOException {
        String path = "D:\\ShellExt\\奖牌金榜.txt";
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
//        bufferedWriter.write("\n澳大利亚，1，2，1，4\n英国，1，1，0，2\n匈牙利，1，0，2，3\n" +
//                "比利时，1，0，1，2\n捷克，1，0，1，2\n斯洛伐克，1，0，1，2\n" +
//                "白俄罗斯，0，2，0，2\n西班牙，0，1，0，1\n乌克兰，0，1，0，1\n"+
//                "爱沙尼亚，0，0，1，1\n拉脱维亚，0，0，1，1\n波兰，0，0，1，1\n");
//        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        String[] strings = new String[5];
        int i = 0;
        ArrayList arrayList = new ArrayList();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        }
    }






