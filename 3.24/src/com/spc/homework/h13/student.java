package com.spc.homework.h13;

public class student extends Person{

    private String stu_id;

    public student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.print());
        System.out.println("学号："+stu_id);
        study();
        System.out.println(play());
    }
}
