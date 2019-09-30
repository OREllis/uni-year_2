package com.uni.year2.week3.exercise3x7;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        final int arraySize = getArraySize();

        int[] array = getValidArray(arraySize);
        System.out.println("The values are: " + Arrays.toString(array));
    }

    private static int getArraySize() {
        while (true) {
            System.out.println("Enter the number of items: ");
            try {
                return Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Number wasn't entered, please enter a numerical value");
            }
        }
    }

    private static int[] getValidArray(int arraySize) {
        while (true) {
            System.out.println("Enter the value of all items (Separated by space): ");
            final String rawString = scan.nextLine();
            final String[] array = rawString.split(" ");

            if (array.length != arraySize) {
                System.out.println("Invalid number of entries, please enter " + arraySize + " Items");
                continue;
            }

            if (StringUtils.isNumeric(rawString.replaceAll(" ", ""))) {
                return Arrays.stream(array)
                        .map(Integer::parseInt)
                        .mapToInt(Integer::intValue)
                        .toArray();
            } else {
                System.out.println("Invalid values entered");
            }

        }
    }


}
