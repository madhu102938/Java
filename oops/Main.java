package oops;
import oops.encap.*;
import oops.inhert.*;
import oops.poly.*;
import oops.abs.*;
import oops.composition.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("vol1", "madhu");
        library.addBook("vol2", "myntra");
        library.addBook("vol3", "madh2");
        library.addBook("vol4", "mad234");

        System.out.println(library);

        library.deleteBook("vol3", "madh2");

        System.out.println(library);
    }
}
