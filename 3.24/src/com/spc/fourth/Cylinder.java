package com.spc.fourth;

import static java.lang.Math.PI;

public class Cylinder {
    double height;
    public double bulk(double height, double area) {
        return height * area;
    }
    static class Circle {
        double r;
        public double area(double r) {
            return PI * r * r;
        }
    }
}
