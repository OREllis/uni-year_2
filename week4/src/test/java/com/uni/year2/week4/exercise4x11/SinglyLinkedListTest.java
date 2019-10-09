/*******************************************************************************
 * Copyright (c) 2019 Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week4.exercise4x11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> linkedList;

    @Test
    public void testGetSize() {
        linkedList = new SinglyLinkedList<>();

        for (int i = 1; i < 6; i++) {
            linkedList.addLast(i);
        }

        assertEquals(linkedList.getSize(), 5);
    }

    @Test
    public void testGetSizeDifferentNumberOfElements() {
        linkedList = new SinglyLinkedList<>();

        for (int i = 1; i < 11; i++) {
            linkedList.addLast(i);
        }

        assertEquals(linkedList.getSize(), 10);
    }

    @Test
    public void testGetSizeEmptyList() {
        linkedList = new SinglyLinkedList<>();

        assertEquals(linkedList.getSize(), 0);
    }

    @Test
    public void testRotate(){
        linkedList = new SinglyLinkedList<>();

        for (int i = 1; i < 6; i++) {
            linkedList.addLast(i);
        }

        linkedList.rotate();

        assertEquals((int)linkedList.first(), 5);
        assertEquals((int)linkedList.last(), 1);
    }
}
