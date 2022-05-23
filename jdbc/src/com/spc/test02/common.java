package com.spc.test02;

public abstract class common {
    private String name;
    private String position;
    private int salary;
    private int nowSalary;
    private int tax;
    private int now;

    public common(String name, String position, int salary, int nowSalary, int tax) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.nowSalary = nowSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getNowSalary() {
        return nowSalary;
    }

    public int getTax() {
        return tax;
    }

    public int getNow() {
        return now;
    }
    public abstract int nowSalary();
}
