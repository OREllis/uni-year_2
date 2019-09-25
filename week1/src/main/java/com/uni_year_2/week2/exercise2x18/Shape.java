package com.uni_year_2.week2.exercise2x18;

public abstract class Shape {

    private String colour;
    private boolean filled;

    public Shape(){}

    public Shape(final String colour, final boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", isFilled=" + filled +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
