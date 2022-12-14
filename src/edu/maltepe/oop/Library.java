package edu.maltepe.oop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * This class is the engine of the program
 */

public class Library {

    static Map<BookCollection, String> bookCatalog =
            new HashMap<BookCollection, String>(); //Entire collection of books

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //Test BookCollection objects:
        BookCollection book1 = new BookCollection(5);
        BookCollection book2 = new BookCollection(3);
        BookCollection book3 = new BookCollection(2);

        bookCatalog.put(book1, "Cracking the Coding Interview");
        bookCatalog.put(book2, "Crime and Punishment");
        bookCatalog.put(book3, "Catch-22");

        //Client borrows 2 copies of Catch-22
        borrowBook("Catch-22");
        borrowBook("Catch-22");


        printCatalog();
        System.out.println();

        //Client returns the copies
        returnBook("Catch-22");
        returnBook("Catch-22");


        //Test if catalog has been updated correctly
        printCatalog();
        System.out.println();

    }

    /*
     * printCatalog()
     *
     * Return type: void
     *
     * This method prints out each collection of books
     */

    public static void printCatalog() {

        for(Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {

            BookCollection bc = (BookCollection) entry.getKey();

            System.out.println("Title: " + entry.getValue());
            bc.printBooks();
            System.out.println();
        }
    }

    /*
     * I am sure there is a way to simplify 'borrowBook()' and 'returnBook()' by use of a new method
     * that does what both of these already do (searching for a book title match)
     */

    /*
     * borrowBook(String bookTitle)
     *
     * Return type: void
     *
     * This method borrows a book from a collection
     */

    public static void borrowBook(String bookTitle) { //Borrows a book from the entire library catalog

        for(Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {
            if(entry.getValue().equals(bookTitle)) {
                BookCollection bc = (BookCollection) entry.getKey();
                if(bc.borrowBook())
                    System.out.println("Damla has successfully borrowed " + bookTitle);
                else
                    System.out.println("All copies of " + bookTitle + " have been checked out already, sorry! :(");

                return;
            }
            else {
                continue;
            }
        }

        System.out.println(bookTitle + " doesn't exist - sorry!");

    }

    /*
     * returnBook(String bookTitle)
     *
     * Return type: void
     *
     * This method returns a book back to the collection of books
     *
     */

    public static void returnBook(String bookTitle) {
        for(Map.Entry<BookCollection, String> entry : bookCatalog.entrySet()) {

            if(entry.getValue().equals(bookTitle)) {
                BookCollection bc = (BookCollection) entry.getKey();
                if(bc.returnBook())
                    System.out.println("Damla has successfully returned " + bookTitle);
                else
                    System.out.println(bookTitle + " cannot be returned at this time");

                return;

            }
            else {
                continue;
            }
        }

        System.out.println(bookTitle + " doesn't exist - sorry!");

    }

}