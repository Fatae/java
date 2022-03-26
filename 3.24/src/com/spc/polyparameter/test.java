package com.spc.polyparameter;

public class test {
    public static void main(String[] args) {
        common tom = new common("tom", 9000);
        manager spc = new manager("spc", 20000, 10000);
        test test = new test();
        System.out.println(test.showEmpAnnual(tom));
        System.out.println(test.showEmpAnnual(spc));
        test.testwork(tom);
        test.testwork(spc);
        int i=10;
        double d=10.0;
        System.out.println(i==d);
    }
    public String showEmpAnnual(Employee e){
        return "薪水为"+e.getAnnual();
    }
    public void testwork(Employee e){
        if(e instanceof common){
            ((common) e).work();
        }
        else if(e instanceof manager){
            ((manager) e).manage();
        }
    }
}
