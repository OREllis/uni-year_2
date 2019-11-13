/*******************************************************************************
 * Copyright (c) 2019 Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week8.exercise5x12;

public class EmpericalAnalysisAlgorithm {

    public static void main(String... args) {
        long start1 = System.nanoTime();
        algo(50);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        algo(50_000);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        algo(500_000);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        long start4 = System.nanoTime();
        algo(500_000);
        long end4 = System.nanoTime();
        long time4 = end4 - start4;

        System.out.println(String.format("Times of execution in nanoseconds: \n1: %s,\n2: %s,\n3: %s,\n4: %s,", time1, time2, time3, time4));
    }

    public static int[] algo(final int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i - 1;
        }

        return arr;
    }
}
