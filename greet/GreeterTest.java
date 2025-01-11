package greet;
import java.util.Scanner;
/**
 * just a class to test out the Greeter.
 */
public class GreeterTest {
	/**
	 * main starting point of the file.
	 * @param arg unused :|
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("your name is " + name);
	}
}