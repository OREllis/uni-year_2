/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

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
