package com.spc.polyparameter;

public class manager extends Employee{
    private double bonus;

    public manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("资本家");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
