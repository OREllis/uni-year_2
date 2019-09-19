package com.uni_year_2.week1.exercise1x17;

public class BirthdayParadoxMain {
    public static void main(String... args) {
        final int STUDENTS = 24;
        final int SIMULATIONS = 500;

        System.out.printf("Students: %d%n", STUDENTS);
        System.out.printf("Simulations: %d%n", SIMULATIONS);
        System.out.printf("Probability: %.4f%n", BirthdayParadox.getDuplicateProbability(STUDENTS));
    }
}
