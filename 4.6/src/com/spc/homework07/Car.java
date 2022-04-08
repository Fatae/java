package com.spc.homework07;

public class Car {
    private double temperature;
    class Air{
        public void flow(){
            if(temperature>40){
                System.out.println("凉风");
            }
            else if(temperature<0){
                System.out.println("暖风");
            }else {
                System.out.println("关掉空调");
            }
        }
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }
}
