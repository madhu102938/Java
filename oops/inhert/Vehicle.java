package oops.inhert;

public class Vehicle {
    private String make, model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
