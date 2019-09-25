package com.uni_year_2.week2.exercise2x18;

public class Square extends Shape{

    private double side;

    public Square(){
        this.side = 1;
    }

    public Square(final double side){
        this.side = side;
    }

    public Square(final double side, final String colour, final boolean filled){
        this.side = side;
        this.setColour(colour);
        this.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " side=" + this.side +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", colour=" + this.getColour() +
                ", isFilled=" + this.isFilled() +
                '}';
    }
}
