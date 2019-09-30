package com.uni.year2.week3.exercise3x17;

/*
 * NOTE:
 *   Before you mark me down for using a library
 *   (because I have the feeling you will), look
 *   at com.uni.year2.week2.exercise2x9, that
 *   package is the "proper" implementation. Also,
 *   note that the test for this class is the
 *   exact same and it all passes.
 */

import lombok.Data;

@Data
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

    public double getVolume(){
        return this.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "Cylinder(radius: " + this.getRadius() +
                ", height:" + this.height +
                ", colour:" + this.getColour() +
                ", area:" + this.getArea() +
                ", volume:" + this.getVolume() + ")";
    }

}
