package com.uni_year_2.week1.exercise1x8;

public class Circle {

    private double radius;
    private String colour;

    public Circle(){
        this.radius = 1.8;
        this.colour = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }
}
