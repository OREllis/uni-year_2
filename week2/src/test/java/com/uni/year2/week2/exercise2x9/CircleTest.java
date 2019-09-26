package com.uni.year2.week2.exercise2x9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(circle.getRadius(), 1.8d, 0);
        assertEquals(circle.getColour(), "Red");
    }

    @Test
    public void testRadiusConstructorOverload(){
        Circle circle = new Circle(4.5);
        assertEquals(circle.getRadius(), 4.5, 0);
    }

    @Test
    public void testRadiusAndColourOverload(){
        Circle circle = new Circle(3.6, "Blue");
        assertEquals(circle.getRadius(), 3.6, 0);
        assertEquals(circle.getColour(), "Blue");
    }

    @Test
    public void testGetArea(){
        Circle circle = new Circle(10, "Blue");

        assertEquals(circle.getArea(), 314.1592653589793d, 0);
    }
}
