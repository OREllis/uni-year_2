/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

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
