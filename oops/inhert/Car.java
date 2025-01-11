package oops.inhert;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getDoors() {
        return numberOfDoors;
    }
}
