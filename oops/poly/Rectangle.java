package oops.poly;

public class Rectangle implements Shape {
    private double len, breadth;

    public Rectangle(double len, double breadth) {
        this.len = len;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return this.len * this.breadth;    
    }
}
