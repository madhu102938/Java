import edu.sjsu.cs.yourcourse.yourname.Greeter;
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
		Greeter name2 = new Greeter("Madhu Pro");
		Greeter.swapNames(name1, name2);
		System.out.println("name1 : " + name1.sayHello());
		System.out.println("name2 : " + name2.sayHello());
		
	}
}