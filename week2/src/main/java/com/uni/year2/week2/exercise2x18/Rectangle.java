package com.uni.year2.week2.exercise2x18;

public class Rectangle extends Square{

    private double width;

    public Rectangle(){
        super(1.8);
        this.width = 3.6;
        this.setColour("Red");
        this.setFilled(true);
    }

    public Rectangle(final double length, final double width){
        this.width = width;
        this.setSide(length);
    }

    public Rectangle(final double length, final double width, final String colour, final boolean filled){
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