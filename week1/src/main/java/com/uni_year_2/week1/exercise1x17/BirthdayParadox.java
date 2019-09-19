package com.uni_year_2.week1.exercise1x17;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;

public class BirthdayParadox {

    private static final Random DATE_GENERATOR = new SecureRandom();
    private static final int DAYS_IN_YEAR = 364;
    private static final int TOTAL_SIMULATIONS= 500;

    public static double getDuplicateProbability(final int totalBirthdays){
        int countOfDuplicates = 0;

        for (int i = 0; i < TOTAL_SIMULATIONS; i++) {
            if (containsDuplicates(newListOfLocalDateBirthdays(totalBirthdays))) {
                countOfDuplicates++;
            }
        }

        return (double) countOfDuplicates / TOTAL_SIMULATIONS;
    }

    private static List<LocalDate> newListOfLocalDateBirthdays(int listSize) {
        ArrayList<LocalDate> outList = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            outList.add(LocalDate.ofYearDay(2019, DATE_GENERATOR.nextInt(DAYS_IN_YEAR) + 1));
        }

        return outList;
    }

    private static boolean containsDuplicates(List<LocalDate> listOfBirthdays) {
        return new HashSet<>(listOfBirthdays).size() < listOfBirthdays.size();
    }
}
