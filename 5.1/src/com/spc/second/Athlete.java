package com.spc.second;

import java.io.Serializable;

public class Athlete implements Serializable {
    private String name;
    private int age;
    private String country;
    public void athleteInfo(){
        System.out.println("姓名："+name+"年龄："+age+"国籍："+country);
    }

    public Athlete(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
