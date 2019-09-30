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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircleTest {

    private static Circle circle;

    @Test
    public void testDefaultConstructor() {
        circle = new Circle();
        assertEquals(circle.getRadius(), 1.8d, 0);
        assertEquals(circle.getColour(), "Red");
    }

    @Test
    public void testRadiusConstructorOverload(){
        circle = new Circle(4.5);
        assertEquals(circle.getRadius(), 4.5, 0);
    }

    @Test
    public void testRadiusAndColourOverload(){
        circle = new Circle(3.6, "Blue", true);
        assertEquals(circle.getRadius(), 3.6, 0);
        assertEquals(circle.getColour(), "Blue");
        assertTrue(circle.isFilled());
    }

    @Test
    public void testGetArea(){
        circle = new Circle(10, "Blue", false);
        assertEquals(circle.getArea(), 314.1592653589793d, 0);
    }

    @Test
    public void testGetPerimeter(){
        circle = new Circle(5);
        assertEquals(circle.getPerimeter(), 31.41592653589793, 0);
    }
}
