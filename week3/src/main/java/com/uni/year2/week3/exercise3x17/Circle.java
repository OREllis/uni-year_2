package com.uni.year2.week3.exercise3x17;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
* NOTE:
*   Before you mark me down for using a library
*   (because I have the feeling you will), look
*   at com.uni.year2.week2.exercise2x9, that
*   package is the "proper" implementation. Also,
*   note that the test for this class is the
*   exact same and it all passes.
*/

@Data
@AllArgsConstructor
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

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
