package com.spc.fifth;

public class Drive {
    private int age;
    private String type;
public void drive(Vehicle v){
    if(type.equals("A1")){
        if(!(age>=26&&age<=50)){
            throw new ageException("年龄应该在26-50之间");
        }
        else {
            System.out.println("年龄合法");
        }
    }
}

    public Drive(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
