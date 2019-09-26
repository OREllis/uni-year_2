package com.uni.year2.week1.exercise1x17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayParadoxTest {


    @Test
    public void testStandardBirthdayParadoxProbability(){
        final double probability = BirthdayParadox.getDuplicateProbability(24);

        //This test checks if the % chance of a duplicate is approximately 50%
        //as the percentage varies between %51 & %55
        assertEquals(String.format("%.1f", probability), "0.5");
    }
}
