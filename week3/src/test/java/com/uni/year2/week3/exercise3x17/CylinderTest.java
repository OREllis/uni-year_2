/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week3.exercise3x17;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CylinderTest {

    private Cylinder cylinder;

    @Test
    public void testConstructor(){
       cylinder = new Cylinder();
        assertEquals(cylinder.getHeight(), 1.0d, 0);
        assertEquals(cylinder.getColour(), "Red");
        assertEquals(cylinder.getRadius(), 1.8d, 0);
    }

    @Test
    public void testRadiusOverloadedConstructor(){
        cylinder = new Cylinder(2.5d);
        assertEquals(cylinder.getRadius(), 2.5d, 0);
    }

    @Test
    public void testRadiusAndHeightOverloadedConstructor(){
        cylinder = new Cylinder(1.2d, 5);
        assertEquals(cylinder.getRadius(), 1.2d, 0);
        assertEquals(cylinder.getHeight(), 5, 0);
    }

    @Test
    public void testRadiusHeightAndColourOverloadedConstructor(){
        cylinder = new Cylinder(1.8d, 3, "Purple");
        assertEquals(cylinder.getRadius(), 1.8d, 0);
        assertEquals(cylinder.getHeight(), 3, 0);
        assertEquals(cylinder.getColour(), "Purple");
    }

    @Test
    public void testGetVolume(){
        cylinder = new Cylinder(1, 2);
        assertEquals(cylinder.getVolume(), 6.283185307179586, 0);
    }
}
