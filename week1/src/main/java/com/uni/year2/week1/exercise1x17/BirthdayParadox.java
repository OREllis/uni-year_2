/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week1.exercise1x17;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;

public class BirthdayParadox {

    private static final Random DATE_GENERATOR = new SecureRandom();
    private static final int DAYS_IN_YEAR = 364;
    private static final int TOTAL_SIMULATIONS = 1000;

    public static double getDuplicateProbability(final int totalBirthdays) {
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
