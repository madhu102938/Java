package oops.composition;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void deleteBook(String title, String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
            }
        }
    }

    @Override
    public String toString() {
        String returnString = "[";
        for (Book book : books) {
            returnString += "(" + book.getTitle() + ","  + book.getAuthor() + ")";
        } 
        return returnString;
    }
}
