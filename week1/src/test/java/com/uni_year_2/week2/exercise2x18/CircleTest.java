package com.uni_year_2.week2.exercise2x18;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Circle circle = new Circle(3.6, "Blue", true);
        assertEquals(circle.getRadius(), 3.6, 0);
        assertEquals(circle.getColour(), "Blue");
        assertTrue(circle.isFilled());
    }

    @Test
    public void testGetArea(){
        Circle circle = new Circle(10, "Blue", false);
        assertEquals(circle.getArea(), 314.1592653589793d, 0);
    }
}
