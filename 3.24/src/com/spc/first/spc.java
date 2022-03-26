package com.spc.first;

public class spc {
    public static void main(String[] args) {
        Athlete athlete = new Athlete("spc",19,"China");
        athlete.athleteInfo();
        Event event = new Event("冰壶");
        event.joinEvent(athlete);
    }
}
class Athlete{
    String name;
    int age;
    String country;

    public Athlete(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void athleteInfo(){
        System.out.println("name="+name+"\t"+"age="+age+
                "\t"+"country="+country);
    }
}
class Event{
    String item;
    String yard;
    int num;

    public Event(String item) {
        this.item = item;
    }

    public void joinEvent(Athlete A){
        System.out.println("项目名称="+item+"\t"+"运动员姓名="
        +A.name);
    }
}