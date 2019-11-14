package com.uni.year2.week8.exercise8x10;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class SortedAlternateElementsTest {

    private SortedAlternateElements sortedAlternateElements;

    @Before
    public void setup() {
        sortedAlternateElements = new SortedAlternateElements();
        sortedAlternateElements.setArray1(new int[]{10, 15, 25});
        sortedAlternateElements.setArray2(new int[]{1, 5, 20, 30});
    }

    @Test
    public void testIfExpectedOutput() {

        ArrayList<Integer[]> output = sortedAlternateElements.getPossibleArrays();
        output.forEach(x -> System.out.println(Arrays.toString(x)));

    }
}
