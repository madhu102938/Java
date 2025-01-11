package oops;
import oops.encap.*;
import oops.inhert.*;
import oops.poly.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
