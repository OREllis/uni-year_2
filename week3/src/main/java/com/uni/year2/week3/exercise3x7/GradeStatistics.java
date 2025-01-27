/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week3.exercise3x7;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GradeStatistics {

    private static Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {
        int numberOfStudents = getValidNumberOfStudents();
        int[] grades = getValidArray(numberOfStudents);

        System.out.println("The Grades are: " + Arrays.toString(grades));
        System.out.println("The Average is: " + getAverage(grades));
        System.out.println("The Median is: " + getMedian(grades));
        System.out.println("The Max is: " + getMax(grades));
        System.out.println("The Min is: " + getMin(grades));
        System.out.println("The standard deviation is: " + getStdDeviation(grades));
    }

    private static int getValidNumberOfStudents() {
        while (true) {
            System.out.println("Enter the number of Students: ");
            try {
                return Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Number wasn't entered, please enter a numerical value");
            }
        }
    }

    private static int[] getValidArray(final int arraySize) {
        int[] grades = new int[arraySize];

        for (int student = 0; student < arraySize; student++) {
            while (true) {
                System.out.println("Enter the grade for student " + (student + 1) + ": ");
                try {
                    grades[student] = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Number wasn't entered, please enter an integral value");
                    continue;
                }

                break;
            }
        }

        return grades;
    }

    private static double getStdDeviation(final int... grades) {
        double mean = getAverage(grades);

        double[] variances = Arrays.stream(grades)
                .mapToDouble(x -> x)
                .toArray();

        double sum = Arrays.stream(variances)
                .map(x -> Math.pow((x - mean), 2))
                .sum() / variances.length;

        return Math.sqrt(sum);
    }

    private static double getAverage(final int... grades) {
        double total = 0;

        for (int grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }

    private static double getMedian(final int... grades) {
        int[] tmp = grades.clone();
        int middle = tmp.length / 2;

        Arrays.sort(tmp);

        if (tmp.length % 2 == 1) return tmp[middle];
        else return (tmp[middle - 1] + tmp[middle]) / 2.0;
    }

    private static int getMax(final int... grades) {
        List tmp = Arrays.asList(ArrayUtils.toObject(grades));
        return (int) Collections.max(tmp);
    }

    private static int getMin(final int... grades) {
        List tmp = Arrays.asList(ArrayUtils.toObject(grades));
        return (int) Collections.min(tmp);
    }
}

/*
 * References:
 *   http://stackoverflow.com/questions/1484347/ddg#1486010
 *   https://stackoverflow.com/questions/18390548/how-to-calculate-standard-deviation-using-java
 */
