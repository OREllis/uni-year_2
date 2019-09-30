/*******************************************************************************
 * Copyright (c) 2019. Peter Ellis
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/

package com.uni.year2.week2.exercise2x18;

public class Rectangle extends Square {

    private double width;

    public Rectangle() {
        super(1.8);
        this.width = 3.6;
        this.setColour("Red");
        this.setFilled(true);
    }

    public Rectangle(final double length, final double width) {
        this.width = width;
        this.setSide(length);
    }

    public Rectangle(final double length, final double width, final String colour, final boolean filled) {
        this.width = width;
        this.setSide(length);
        this.setColour(colour);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.getSide();
    }

    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public double getArea() {
        return this.getSide() * this.width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.getSide()) + (2 * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + this.getSide() +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", colour=" + this.getColour() +
                ", isFilled=" + this.isFilled() +
                '}';
    }
}
