package com.uni.year2.week3.exercise3x17;

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
        int printed= 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if (printed == numOfCylinders) return;
                System.out.println((i + 1) + ", " + (j + 1) + ": " + cylinders[i][j]);
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
