package com.uni.year2.week8.exercise8x10;

import com.uni.year2.week8.exercise8x10.exception.InvalidArrayLengthsException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void getPermutationsOfCombindedArrays() {
        final ArrayList<Integer> combindedArrays = new ArrayList<>();
        combindedArrays.add(array1[0]);

        populateListWithCombindedArrays(combindedArrays.get(0), true, combindedArrays);
        System.out.println(combindedArrays);
    }

    public void populateListWithCombindedArrays(final int current, boolean isA, final List<Integer> outList) {
        int newCurrent;

        if (isA) {
            newCurrent = getNext(current, 0, array2);
            if(newCurrent == -1) return;
            outList.add(newCurrent);
            populateListWithCombindedArrays(newCurrent, false, outList);
        } else {
            newCurrent = getNext(current, 0, array1);
            if(newCurrent == -1) return;
            outList.add(newCurrent);
            populateListWithCombindedArrays(newCurrent, true, outList);
        }
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
