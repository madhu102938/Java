package oops;
import oops.encap.*;

public class Main {
    public static void main(String[] args) {
        Person name1 = new Person();
        name1.setName("Madhu");
        name1.setAge(21);
        name1.setAddress("Hyderabad");

        name1.displayAll();
    }
}
