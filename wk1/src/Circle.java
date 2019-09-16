public class Circle {
    private double radius;
    private String colour;

    Circle(){
        this.radius = 1.8;
        this.colour = "Red";
    }

    Circle(double radius){
        this.radius = radius;
        this.colour = "Red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColour() {
        return this.colour;
    }
}
