package homework03;

import java.util.Locale;

public class test {
    public static void main(String[] args) {
        String str="song pei chuan";
        getName(str);

    }
    public static void getName(String str){
        if(str==null){
            System.out.println("不能为空");
        }
        String[] s = str.split(" ");
        if(s.length!=3){
            System.out.println("格式不对");
        }
        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));//格式化字符串，
        // 将字符串转为大写，取第一个字符串
        System.out.println(format);
    }

}
