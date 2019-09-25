package com.uni_year_2.week2.exercise2x18;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private static Square square;

    @Test
    public void testDefaultConstructor() {
        square = new Square();
        assertEquals(square.getSide(), 1, 0);
        assertEquals(square.getColour(), "Red");
        assertTrue(square.isFilled());
    }

    @Test
    public void testWidthAndLengthConstructorOverload() {
        square = new Square(10);
        assertEquals(square.getSide(), 10, 0);
    }

    @Test
    public void testAllArgsConstructorOverload(){
        square = new Square(2.5, "Blue", true);
        assertEquals(square.getSide(), 2.5, 0);
        assertEquals(square.getColour(), "Blue");
        assertTrue(square.isFilled());
    }

    @Test
    public void testGetArea() {
        square = new Square(10);
        assertEquals(square.getArea(), 100, 0);
    }

    @Test
    public void testGetPerimeter() {
        square = new Square(16);
        assertEquals(square.getPerimeter(), 64d, 0);
    }

}
