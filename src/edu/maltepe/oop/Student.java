package edu.maltepe.oop;

public class Student extends Person{
    private String studentname;

    public Student(String name){
        this.studentname = name;
    }

    public void borrow(Book book1) {
    }

    public void returned(Book book1) {
    }

    public void rented(Book book1) {
    }

    public void getTitle(Book book1) {
    }

    /*
    public void read(Book book1){System.out.println(studentname + " read " + book1.bookname + ".");
    }

    public void getTitle(Book book1){System.out.println(studentname + " Title " + book1.bookname + ".");
    }
    public void borrow(Book book1){System.out.println(studentname + " borrow " + book1.bookname + ".");
    }

    public void rented(Book book1){System.out.println(studentname + " rented " + book1.bookname + ".");
    }

    public void returned(Book book1){System.out.println(studentname + " returned " + book1.bookname + ".");
    }
*/

}

