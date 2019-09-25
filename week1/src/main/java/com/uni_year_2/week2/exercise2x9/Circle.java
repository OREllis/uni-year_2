package com.uni_year_2.week2.exercise2x9;

public class Circle {

    private double radius;

    private String colour;
    public Circle(){
        this.radius = 1.8;
        this.colour = "Red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = "Red";
    }

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }


    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
