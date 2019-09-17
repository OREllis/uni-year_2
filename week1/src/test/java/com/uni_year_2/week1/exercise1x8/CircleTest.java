package com.uni_year_2.week1.exercise1x8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(circle.getRadius(), 1.8d, 0);
        assertEquals(circle.getColour(), "red");
    }

    @Test
    public void testConstructorOverload(){
        Circle circle = new Circle(4.5);

        assertEquals(circle.getRadius(), 4.5, 0);
    }
}
