package edu.maltepe.oop;

public class Prof extends Person{
    private String profname;

    public Prof(String name){
        this.profname = name;
    }

    public void borrow(
            Book book1) {
    }

    public void returned(Book book1) {
    }

    public void rented(Book book1) {
    }

    public void getTitle(Book book1) {
    }

    /*public void read(Book book1){
        System.out.println(profname+ " read " + book1.bookname + ".");
    }
    public void getTitle(Book book1){System.out.println(profname + " Title " + book1.bookname + ".");
    }
    public void borrow(Book book1){System.out.println(profname + " borrow " + book1.bookname + ".");
    }

    public void rented(Book book1){System.out.println(profname + " rented " + book1.bookname + ".");
    }
    public void returned(Book book1){System.out.println(profname + " returned " + book1.bookname + "."); }
*/
}

