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
