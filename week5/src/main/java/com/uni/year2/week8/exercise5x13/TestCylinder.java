/*******************************************************************************
 * Copyright (c) 2019 Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week8.exercise5x13;

import java.util.Scanner;

public class TestCylinder {

    private static Cylinder[][] cylinders = new Cylinder[4][25];

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        final int numOfCylinders = getValidNumberOfCylinders();
        final Cylinder cylinder = new Cylinder(getValidRadius(), getValidHeight(), getColour());

        makeCylinders(cylinder, numOfCylinders);
        printCylinders(numOfCylinders);

    }

    //Default implementation
    private static void makeCylinders() {
        int totalCylinders = getValidNumberOfCylinders();
        int addedCylinders = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if (addedCylinders == totalCylinders) return;

                cylinders[i][j] =  new Cylinder(getValidRadius(), getValidHeight(), getColour());
                addedCylinders++;
            }
        }
    }

    private static void makeCylinders(final Cylinder cylinder, final int numOfCylinders) {
        int addedCylinders = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if (addedCylinders == numOfCylinders) return;

                cylinders[i][j] = cylinder;
                addedCylinders++;
            }
        }
    }

    private static void printCylinders(int numOfCylinders) {
        int printed = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if (printed == numOfCylinders) return;
                System.out.println(printed + ": " + cylinders[i][j]);
                printed++;
            }
        }
    }

    private static int getValidNumberOfCylinders() {
        while (true) {
            try {
                System.out.println("Enter the number of Cylinders you wish to store: ");
                int enteredNum = Integer.parseInt(scan.nextLine());

                if (enteredNum > 100 || enteredNum < 1) {
                    System.out.println("Invalid number, enter a number between 1 & 100");
                    continue;
                }

                return enteredNum;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter an Integral value");
            }
        }
    }

    private static double getValidHeight() {
        while (true) {
            try {
                System.out.println("Enter the height you want the cylinder to be: ");
                return Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a numerical value");
            }
        }
    }

    private static double getValidRadius() {
        while (true) {
            try {
                System.out.println("Enter the Radius you want the cylinder to be: ");
                return Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a numerical value");
            }
        }
    }

    private static String getColour() {
        System.out.println("What colour do you wan the cylinders to be: ");
        return scan.nextLine();
    }
}
