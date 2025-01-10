package greet;
/**
 * just a class to test out the Greeter.
 */
public class GreeterTest {
	/**
	 * main starting point of the file.
	 * @param arg unused :|
	 */
	public static void main(String[] arg) {
		Greeter name1 = new Greeter("Madhu");
		System.out.println(name1.sayHello());
		System.out.println(name1.sayGoodbye());
	}
}