package greet;
/**
 * Just a class to Greet the user :)
 */
public class Greeter {
    /**
     * Constructor to initialize the name.
     * @param aname
     */
    public Greeter(String aname) {
        name = aname;
    }

    /**
     * Method to say hello to the user.
     * @return a string saying hello to the user.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    /**
     * Method to say goodbye to the user.
     * @return a string saying goodbye to the user.
     */
    public String sayGoodbye() {
        return "Goodbye, " + name;
    }

    /**
     * setter for name
     * @param aname choose a name you want to change with
     */
    public void setName(String aname) {
        name = aname;
    }

    private String name;
}
