package com.uni_year_2.week1.exercise1x17;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;

public class BirthdayParadox {

    private static final Random DATE_GENERATOR = new SecureRandom();

    public static List<LocalDate> newListOfLocalDateBirthdays() {
        return newListOfLocalDateBirthdays(24);
    }

    public static List<LocalDate> newListOfLocalDateBirthdays(int listSize) {
        if(listSize < 23) throw new IllegalArgumentException("Number of birthdays has to be greater than 23");

        ArrayList<LocalDate> outList = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            outList.add(LocalDate.ofYearDay(2019, DATE_GENERATOR.nextInt(364) + 1));
        }

        return outList;
    }

    public static boolean containsDuplicates(List<LocalDate> listOfBirthdays) {
        return new HashSet<>(listOfBirthdays).size() < listOfBirthdays.size();
    }

}
