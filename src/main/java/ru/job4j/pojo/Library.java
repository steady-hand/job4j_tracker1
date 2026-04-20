package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 900);
        Book book2 = new Book("Pride and Prejudice", 500);
        Book book3 = new Book("Harry Potter", 120);
        Book book4 = new Book("The Great Gatsby", 326);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCountOfPages());
        }
        Book t = books[0];
        books[0] = books[2];
        books[2] = t;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCountOfPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCountOfPages());
            }
        }
    }
}
