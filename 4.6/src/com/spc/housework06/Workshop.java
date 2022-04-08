package com.spc.housework06;

public class Workshop {
    public static House house=new House();

    private Workshop() {
    }

    public static House getHouse(){
        return house;
    }
    public static Boat getBoat(){
        return new Boat();
    }

    public static Plane getPlane(){
        return new Plane();
    }
}
