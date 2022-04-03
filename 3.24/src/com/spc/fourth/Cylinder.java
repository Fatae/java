package com.spc.fourth;

import static java.lang.Math.PI;

public class Cylinder {
    private double height;

    public double bulk(double height,double area){
        return area*height;
    }
     class Circle{
        private double r;
        public double area(double r){
            return r*r*PI;
        }
    }
}
