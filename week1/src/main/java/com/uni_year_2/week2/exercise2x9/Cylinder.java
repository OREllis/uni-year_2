package com.uni_year_2.week2.exercise2x9;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public Cylinder(final double radius, final double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(final double radius){
        this(radius, 1.0);
    }

    public Cylinder(final double radius, final double height, final String colour){
        super(radius, colour);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.getArea() * this.height;
    }

}
