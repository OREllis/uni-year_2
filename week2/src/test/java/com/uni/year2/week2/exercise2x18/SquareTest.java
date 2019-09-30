/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week2.exercise2x18;

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
    public void testAllArgsConstructorOverload() {
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
