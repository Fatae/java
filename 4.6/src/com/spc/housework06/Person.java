package com.spc.housework06;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat) ) {
            vehicles = Workshop.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof House)) {
            vehicles = Workshop.getHouse();
        }
        vehicles.work();
    }
    public void passMain(){
        if(!(vehicles instanceof Plane)){
            vehicles=Workshop.getPlane();
        }
        vehicles.work();
    }
}
