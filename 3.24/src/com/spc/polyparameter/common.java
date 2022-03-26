package com.spc.polyparameter;

public class common extends Employee{
    public common(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("打工人");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
