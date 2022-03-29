package com.spc.chapter10;
public class Stu {
    public static void main(String[] args) {
        Stu1 tom = new Stu1("tom");
        tom.payFee(100);
        Stu1 mary = new Stu1("mary");
        mary.payFee(100);
        tom.showFee();
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
    }
}
class Stu1{
    private String name;
    private static double fee=0;

    public Stu1(String name) {
        this.name = name;
    }
    public  void payFee(double fee){
        Stu1.fee+=fee;
    }
    public  void showFee(){
        System.out.println(Stu1.fee);
    }
}
