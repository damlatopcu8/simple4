package edu.maltepe.oop;


public class Main {
    public static void main(String[] args) {

        Prof prof1 = new Prof("Ensar Gül");
        Student student1 = new Student("Damlanur Topcu");
        //Book book1 = new Book("OOP book");
        Book book1 = new Book("Satranc");


        //prof1.read(book1);
        //student1.read(book1);
        prof1.borrow(book1);
        student1.borrow(book1);
        prof1.returned(book1);
        student1.returned(book1);
        prof1.rented(book1);
        student1.rented(book1);
        prof1.getTitle(book1);
        student1.getTitle(book1);


    }
}
