package com.spc.Demo;

public class override {
    public static void main(String[] args) {
        Person person = new Person("spc", 19);
        Student spc = new Student("spc", 19, "137193", 150);
        System.out.println(person.say());
        System.out.println( spc.say());
    }
}

 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "name=" + name + " " + "age=" + age;
    }
}

class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return  super.say()+ "id=" + id + " " + "score=" + score;
    }//引用父类利用super
}

