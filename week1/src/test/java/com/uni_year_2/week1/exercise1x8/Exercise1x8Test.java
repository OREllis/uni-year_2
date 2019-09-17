package com.uni_year_2.week1.exercise1x8;


import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1x8Test {

    private Exercise1x8 exercise = new Exercise1x8();

    @Test
    public void isOddTest() {
        assertTrue(exercise.isOdd(5));
        assertFalse(exercise.isOdd(2));
    }

    @Test
    public void isMultipleOfTest() {
        assertTrue(exercise.isMultipleOf(10, 5));
        assertFalse(exercise.isMultipleOf(3, 8));
    }
}
