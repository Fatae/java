package com.spc.second;

import java.io.Serializable;

public class Event implements Serializable {
    private String eventName;
    private String ground;
    private Athlete athlete;
    public void display(){
        System.out.println("项目名称："+eventName+"项目场地："+ground+"运动员姓名："+athlete.getName());
    }

    public Event(String eventName, String ground, Athlete athlete) {
        this.eventName = eventName;
        this.ground = ground;
        this.athlete = athlete;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", ground='" + ground + '\'' +
                ", athlete=" + athlete +
                '}';
    }
}
