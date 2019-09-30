package com.uni.year2.week3.exercise3x15;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    private final int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10};


    @Test
    public void reverseTest(){
        int[] reverseTestArray = {1, 2, 3, 4, 5, 6};
        int[] oddTestArray = {1, 2, 3, 4, 5, 6, 7};

        final int[] reversedArray = {6, 5, 4, 3, 2, 1};
        final int[] reversedOddTestArray = {7, 6, 5, 4, 3, 2, 1};

        Array.reverse(reverseTestArray);
        Array.reverse(oddTestArray);

        assertArrayEquals(reverseTestArray, reversedArray);
        assertArrayEquals(oddTestArray, reversedOddTestArray);
    }

    @Test
    public void copyTest(){
        assertArrayEquals(testArray, Array.copyOf(testArray));
    }

    @Test
    public void copyOverloadTest(){
        int[] copyTestArray = {1, 2, 3, 4, 5, 6};

        final int[] truncated = {1, 2, 3, 4};
        final int[] resized = {1, 2, 3, 4, 5, 6, 0, 0};

        assertArrayEquals(copyTestArray, Array.copyOf(copyTestArray));
        assertArrayEquals(truncated, Array.copyOf(copyTestArray, 4));
        assertArrayEquals(resized, Array.copyOf(copyTestArray, 8));
    }

    @Test
    public void swapTest(){
        int[] array1 = {3, 6, 9, 12, 15, 18};
        int[] array2 = {5, 10, 15, 20, 25, 30};

        int[] array1FinalValue = {5, 10, 15, 20, 25, 30};
        int[] array2FinalValue = {3, 6, 9, 12, 15, 18};

        int[] invalid1 = new int[3];
        int[] invalid2 = new int[1];

        Array.swap(array1, array2);

        assertArrayEquals(array1, array1FinalValue);
        assertArrayEquals(array2, array2FinalValue);
        assertFalse(Array.swap(invalid1, invalid2));
    }
}
