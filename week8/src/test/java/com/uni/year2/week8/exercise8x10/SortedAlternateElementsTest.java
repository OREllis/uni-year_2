package com.uni.year2.week8.exercise8x10;

import com.uni.year2.week8.exercise8x10.exception.InvalidArrayLengthsException;
import org.junit.Before;
import org.junit.Test;

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
        sortedAlternateElements.getPermutationsOfCombindedArrays();
    }
}
