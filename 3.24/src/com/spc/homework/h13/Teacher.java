package com.spc.homework.h13;

public class Teacher extends Person{
    int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play()+"象棋  ";
    }
}
