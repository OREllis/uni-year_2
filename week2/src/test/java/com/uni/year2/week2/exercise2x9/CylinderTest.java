package com.uni.year2.week2.exercise2x9;

import org.junit.Test;

import static junit.framework.Assert.*;

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
