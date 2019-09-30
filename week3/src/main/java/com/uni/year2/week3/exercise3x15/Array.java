/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week3.exercise3x15;

public class Array {

    public static void reverse(int[] array) {
        int tmp = 0;
        for (int bottom = 0, top = array.length - 1; bottom < top; bottom++, top--) {
            tmp = array[bottom];
            array[bottom] = array[top];
            array[top] = tmp;
        }
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i >= array.length) copy[i] = 0;
            else copy[i] = array[i];
        }

        return copy;
    }

    public static boolean swap(int[] array1, int[] array2){
        if(array1.length != array2.length) return false;

        int tmp = 0;

        for (int i = 0; i < array1.length; i++) {
            tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }

        return true;
    }
}
