/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week1.exercise1x17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayParadoxTest {


    @Test
    public void testStandardBirthdayParadoxProbability(){
        final double probability = BirthdayParadox.getDuplicateProbability(24);

        //This test checks if the % chance of a duplicate is approximately 50%
        //as the percentage varies between %51 & %55
        assertEquals(String.format("%.1f", probability), "0.5");
    }
}
