package com.uni.year2.week2.exercise2x18;

import org.junit.Test;

import static junit.framework.Assert.*;

public class RectangleTest {
    private static Rectangle rectangle;

    @Test
    public void testDefaultConstructor() {
        rectangle = new Rectangle();
        assertEquals(rectangle.getWidth(), 3.6d, 0);
        assertEquals(rectangle.getLength(), 1.8d, 0);
        assertEquals(rectangle.getColour(), "Red");
        assertTrue(rectangle.isFilled());
    }

    @Test
    public void testWidthAndLengthConstructorOverload() {
        rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.getLength(), 5, 0);
        assertEquals(rectangle.getWidth(), 10, 0);
    }

    @Test
    public void testAllArgsConstructorOverload(){
        rectangle = new Rectangle(1.6, 2.5, "Blue", true);
        assertEquals(rectangle.getLength(), 1.6, 0);
        assertEquals(rectangle.getWidth(), 2.5, 0);
        assertEquals(rectangle.getColour(), "Blue");
        assertTrue(rectangle.isFilled());
    }

    @Test
    public void testGetArea() {
        rectangle = new Rectangle(10, 5);
        assertEquals(rectangle.getArea(), 50, 0);
    }

    @Test
    public void testGetPerimeter() {
        rectangle = new Rectangle(8, 16);
        assertEquals(rectangle.getPerimeter(), 48d, 0);
    }
}
