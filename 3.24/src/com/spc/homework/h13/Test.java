package com.spc.homework.h13;

public class Test {
    public static void main(String[] args) {

        Person[] person=new Person[4];
        person[0]=new Teacher("t1","男",25,1);
        person[1]=new Teacher("t2","女",23,1);
        person[2]=new student("s1","女",18,"11111");
        person[3]=new student("spc","男",19,"666666");
        Test test = new Test();
        test.bubbleSort(person);
        test.show(person[0]);

        student student = new student("小明", "男", 14, "12");
        student.printInfo();

    }
    public void bubbleSort(Person[] person){
        Person temp=null;
        for (int i = 0; i < person.length-1; i++) {
            for(int j=0;j<person.length-i-1;j++){
                if(person[j].getAge()<person[j+1].getAge()){
                    temp=person[j];
                    person[j]=person[j+1];
                    person[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

    }
    public void show(Person x){
        if(x instanceof student){
            ((student) x).study();
        }else if(x instanceof Teacher){
            ((Teacher) x).teach();
        }
    }
}
