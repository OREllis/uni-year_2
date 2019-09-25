package com.uni_year_2.week2.exercise2x18;


public class Circle extends Shape {

    private double radius;

    public Circle(){
        this.radius = 1.8;
        this.setColour("Red");
    }

    public Circle(double radius){
        this.radius = radius;
        this.setColour("Red");
    }

    public Circle(final double radius, final String colour, final boolean filled){
        this(radius);
        this.setColour(colour);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", colour=" + this.getColour() +
                ", isFilled=" + this.isFilled() +
                '}';
    }
}
