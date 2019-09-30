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
    public void testAllArgsConstructorOverload() {
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
