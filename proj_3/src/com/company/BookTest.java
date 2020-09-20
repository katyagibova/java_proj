package com.company;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Katya");
        book.setName("My life");
        book.setPages(100);
        book.setYear(2020);
        System.out.println(book.getAuthor() + " " + book.getYear());
    }
}
