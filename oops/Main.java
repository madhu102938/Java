package oops;
import oops.encap.*;
import oops.inhert.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porshe", "911", 2);
        System.out.println(car.getMake() + car.getModel() + car.getDoors());
    }
}
