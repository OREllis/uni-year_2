package com.uni.year2.week8.exercise8x10;

import com.uni.year2.week8.exercise8x10.exception.InvalidArrayLengthsException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortedAlternateElements {
    //Given two sorted arrays A and B, generate all possible arrays such that first element is taken from A then from B
    //then from A and so on in increasing order till the arrays exhausted.

    private int[] array1;
    private int[] array2;

    SortedAlternateElements() {
    }

    SortedAlternateElements(int[] arr1, int[] arr2) throws InvalidArrayLengthsException {
        throwExceptionIfInvalidArrays();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        this.array1 = arr1;
        this.array1 = arr2;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        Arrays.sort(array1);
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        Arrays.sort(array2);
        this.array2 = array2;
    }

    public ArrayList<Integer[]> getPossibleArrays() {
        ArrayList<Integer[]> outlists = new ArrayList<>();

        for (int i = 0, j = 0; i < array1.length; i++, j = 0) {
            while (true) {
                int[] result = getNthOfCombinedArrs(j++, i);
                if (result == null) break;
                if (result.length < 2) continue;
                outlists.add(Arrays.stream(result).boxed().toArray(Integer[]::new));
            }
        }

        return outlists;
    }

    private int[] getNthOfCombinedArrs(final int n, final int startIndex) {
        return getNthOfCombinedArrs(0, n, startIndex, false, new int[n]);
    }

    private int[] getNthOfCombinedArrs(final int i, final int n, final int start, final boolean isA, final int[] out) {
        if (i == out.length) return out;

        if (isA) {
            final int next = getNext(out[i - 1], 0, array2);
            if (next == -1) return null;
            out[i] = next;
            return getNthOfCombinedArrs(i + 1, n, start, false, out);
        }

        final int next = (i != 0) ? getNext(out[i - 1], 0, array1) : array1[start];
        if (next == -1) return null;
        out[i] = next;
        return getNthOfCombinedArrs(i + 1, n, start, true, out);
    }

    private int getNext(int current, final int index, int[] array) {
        if (index == array.length) return -1;
        if (array[index] > current) return array[index];

        return getNext(current, index + 1, array);
    }

    private void throwExceptionIfInvalidArrays() throws InvalidArrayLengthsException {
        if (array1.length != (array2.length - 1)) {
            throw new InvalidArrayLengthsException();
        }
    }

}
