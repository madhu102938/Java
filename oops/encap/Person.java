package oops.encap;

public class Person {
    private String name, address;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayAll() {
        System.out.println(this.name + " is " + this.age +
         " years old and lives in " + this.address);
    }
}
